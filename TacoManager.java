import java.util.*;
import java.io.*;
public class TacoManager {
	private Taco[] tacos;
	public static final int DEF_SIZE = 100;
	public static final String DELIM = "\t";
	public static final int FIELD_AMT = 3;
	public TacoManager()
	{
		init(DEF_SIZE);
	}
	public TacoManager(int aSize)
	{
		init(aSize);
	}
	public void init(int aSize)
	{
		if(aSize > 0)
		{
			tacos = new Taco[aSize];
		}
	}
	public void addTaco(Taco aTaco)
	{
		/*
		if(tacos[tacos.length - 1] != null) //Array is full
		{
			return;
		}
		*/
		for(int i = 0; i < tacos.length; i++) //Found an empty space
		{
			if(tacos[i] == null)
			{
				tacos[i] = aTaco;
				//break;
				return;
			}
		}
		System.out.println("The array is full.");
	}
	public void removeTaco(Taco aTaco)
	{
		int rmIndex = -1; //Sentinel value
		//Find the index of the remove
		for(int i = 0; i < tacos.length; i++)
		{
			if(tacos[i] != null && tacos[i].equals(aTaco))
			{
				rmIndex = i;
				break;
			}
		}
		//Does the taco exist?
		if(rmIndex == -1)
		{
			return; //Taco was not found
		}
		for(int i = rmIndex; i < tacos.length - 1; i++)
		{
			tacos[i] = tacos[i+1];
		}
		tacos[tacos.length - 1] = null;
	}
	public void print()
	{
		for(int i = 0; i < tacos.length; i++)
		{
			if(tacos[i] == null)
			{
				break;
			}
			System.out.println(tacos[i]);
		}
	}
	public void sortTacosByPrice()
	{
		//Bubble sort
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i = 0; i < tacos.length - 1; i++)
			{
				if(tacos[i].getPrice() > tacos[i+1].getPrice())
				{
					//Swap
					Taco temp = tacos[i];
					tacos[i] = tacos[i+1];
					tacos[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
	}
	//File IO
	public void writeToTacoFile(String aFileName)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aFileName));
			//Print the body
			for(Taco t : tacos)
			{
				fileWriter.println(t.getName()+DELIM+t.getLocation()+DELIM+t.getPrice());
			}
			fileWriter.close(); //Don't forget
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void readATacoFile(String aFileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aFileName));
			int count = 0;
			while(fileScanner.hasNextLine())
			{
				count++;
				fileScanner.nextLine();
			}
			init(count);
			fileScanner = new Scanner(new File(aFileName));
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.next();
				String[] splitLine = fileLine.split(DELIM);
				if(splitLine.length != FIELD_AMT)
				{
					continue;
				}
				String aName = splitLine[0];
				String aLoc = splitLine[1];
				double aPrice = Double.parseDouble(splitLine[2]);
				this.addTaco(new Taco(aName, aLoc, aPrice));
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
