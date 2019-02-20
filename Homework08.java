/*
 * Created by Noah Shaw
 */
import java.io.*;
import java.util.*;

public class Homework08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a word to replace \"danger\" with.");
		Scanner keyboard = new Scanner(System.in);
		String word = keyboard.nextLine();
		printSong("new song.txt", replaceDanger("song.txt", word));

	}
	
	private static final String DELIM = " ";
	private static final String DELIM2 = "\n";
	public static String replaceDanger(String aFileName, String aWord)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aFileName));
			String song = "";
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLine = fileLine.split(DELIM);
				for(int i = 0; i < splitLine.length; i++)
				{
//					Can also replace "danger" with this but it does not ignore punctuation or pluralization
//					if(splitLine[i].equalsIgnoreCase("danger"))
//					{
//						splitLine[i] = aWord;
//					}
					song = song + splitLine[i] + " ";
				}
				song += "\n";
			}
			fileScanner.close();
			//Replaces "danger" while ignoring punctuation, capitalization, and pluralization
			song = song.replaceAll("(?i)\\bdanger\\b", aWord); //Yes, I know how to use regex's confidently
			song = song.replaceAll("(?i)\\bdangers\\b", aWord);
			return song;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
	public static void printSong(String aFileName, String aSong)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aFileName));
			String[] songLine = aSong.split(DELIM2);
			for(int i = 0; i < songLine.length; i++)
			{
				fileWriter.println(songLine[i]);
			}
			fileWriter.close();
			System.out.println("Finished printing to " + "\"" + aFileName + "\".");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
