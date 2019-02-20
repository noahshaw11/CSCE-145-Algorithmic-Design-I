import java.io.File;
import java.util.Scanner;

/*
 * Created by Noah Shaw
 */
public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFile("file.txt");

	}
	
	public static void readFile(String aFileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aFileName));
			int count = 0;
			String file = "";
			while(fileScanner.hasNextLine())
			{
				file = file + fileScanner.next();
			}
			fileScanner.close();
			String newString = "";
			for(int i = 0; i < file.length(); i++)
			{
				char c = file.charAt(i);
				c = Character.toLowerCase(c);
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				{
					newString = newString + c;
				}
			}
			for(int i = 0; i < newString.length(); i++)
			{
				if(newString.charAt(i) == 'a' && newString.charAt(i+1) == 'e' && newString.charAt(i+2) == 'i' && newString.charAt(i+3) == 'o' && newString.charAt(i+4) == 'u')
				{
					count++;
				}
			}
			System.out.println("The file " + "\"" + aFileName + "\"" + " has \"AEIOU\" in order " + count + " times.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
