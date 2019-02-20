import java.util.*;
import java.io.*;
public class UGradRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static final String DELIM = "\t";
	public static void recordToFile(Ugrad[] uGrads, String fileName)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(
					new FileOutputStream(fileName));
			//Write your header
			fileWriter.println("Num Students "+DELIM+uGrads.length);
			//Write your body
			for(int i = 0; i < uGrads.length; i++)
			{
				fileWriter.println(uGrads[i].getName() + DELIM +
									uGrads[i].getID()+DELIM+
									uGrads[i].getLevel());
			}
			fileWriter.close(); //DONT FORGET THIS
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static Ugrad[] readFromFile(String fileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			//Reading the header
			String fileLine = fileScanner.nextLine();
			String[] splitLines = fileLine.split(DELIM);
			if(splitLines.length != 2)
			{
				return null;
			}
			int uCount = 0;
			Ugrad[] retU = new Ugrad[Integer.parseInt(splitLines[1])];
			while(fileScanner.hasNextLine())
			{
				//Read it
				fileLine = fileScanner.nextLine();
				//Split it
				splitLines = fileLine.split(DELIM);
				//Check it
				if(splitLines.length == 3)
				{
					//Apply it
					String name = splitLines[0];
					int id = Integer.parseInt(splitLines[1]);
					int level = Integer.parseInt(splitLines[2]);
					retU[uCount] = new Ugrad(name, id, level);
					uCount++;
				}
			}
			fileScanner.close();
			return retU;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}

}
