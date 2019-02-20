/*
 * Created by Noah Shaw
 */
import java.io.*;
import java.util.Scanner;
public class LibrarySystem {
	
	private LibrarySystemGUI librarySystemGUI; //Construct an instance of LibrarySystemGUI
	private Book[] books = new Book[50]; //Construct the array of books
	
	//Constructor
	public LibrarySystem(LibrarySystemGUI parentLibrarySystemGUI)
	{
		librarySystemGUI = parentLibrarySystemGUI;
	}
	
	//Methods
	public void addBook(Book aBook) //Add a book to the database
	{
		if(books[books.length - 1] != null) //Check if the database is full
		{
			librarySystemGUI.updateDisplay("Sorry the database is full.");
			return;
		}
		else
		{
			for(int i = 0; i < books.length; i++) //Add the book to the first empty slot
			{
				if(books[i] == null)
				{
					books[i] = aBook;
					break;
				}
			}
		}
		print();
	}
	public void removeBook(Book aBook) //Remove a book from the database
	{
		int rmIndex = -1; //Sentinel value
		for(int i = 0; i < books.length; i++) //Find the index of the book to remove
		{
			if(books[i] != null && books[i].equals(aBook))
			{
				rmIndex = i;
				break;
			}
		}
		if(rmIndex == -1) //Check if the book exists
		{
			return;
		}
		for(int i = rmIndex; i < books.length - 1; i++) //Remove the book and move every other book up
		{
			books[i] = books[i + 1];
		}
		books[books.length - 1] = null; //Make the last slot empty
		print();
	}
	public void print() //Print the database
	{
		sort();
		librarySystemGUI.resetDisplay();
		for(int i = 0; i < books.length; i++)
		{
			if(books[i] == null) //Ignore if the slot is empty
			{
				break;
			}
			else //Print each book
			{
				librarySystemGUI.updateDisplay(books[i].toString());
			}
		}
	}
	public void sort()
	{
        boolean hasSwapped = true;  //Determines when the sort is finished
        Book temp;
        //Bubble sort
        while(hasSwapped)
        {
        	hasSwapped = false;
        	for (int j = 0;  j < books.length - 1;  j++)
        	{
        		if(books[j] == null || books[j+1] == null)
        		{
        			return;
        		}
        		if (books[j].getName().compareToIgnoreCase(books[j + 1].getName()) > 0 )
                {
        			temp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temp;
                    hasSwapped = true;
                } 
        	} 
         } 
	}
	public void search(String aSearchBase, String aSearchCriteria) //Search using the desired search base/criteria
	{
		librarySystemGUI.resetDisplay();
		if(aSearchBase.equalsIgnoreCase("name")) //Search base is name
		{
			for(int i = 0; i < books.length; i++) //Find the book with the same name and print it
			{
				if(books[i] != null && books[i].getName().equalsIgnoreCase(aSearchCriteria))
				{
					librarySystemGUI.updateDisplay(books[i].toString());
				}
			}
		}
		else if(aSearchBase.equalsIgnoreCase("author")) //Search base is author
		{
			for(int i = 0; i < books.length; i++) //Find the book with the same author and print it
			{
				if(books[i] != null && books[i].getAuthor().equalsIgnoreCase(aSearchCriteria))
				{
					librarySystemGUI.updateDisplay(books[i].toString());
				}
			}
		}
		else if(aSearchBase.equalsIgnoreCase("year published")) //Search base is year published
		{
			for(int i = 0; i < books.length; i++) //Find the book with the same year published and print it
			{
				if(books[i] != null && books[i].getYearPublished() == Integer.parseInt(aSearchCriteria))
				{
					librarySystemGUI.updateDisplay(books[i].toString());
				}
			}
		}
		else if(aSearchBase.equalsIgnoreCase("publisher")) //Search base is publisher
		{
			for(int i = 0; i < books.length; i++) //Find the book with the same publisher and print it
			{
				if(books[i] != null && books[i].getPublisher().equalsIgnoreCase(aSearchCriteria))
				{
					librarySystemGUI.updateDisplay(books[i].toString());
				}
			}
		}
		else if(aSearchBase.equalsIgnoreCase("ISBN")) //Search base is ISBN
		{
			for(int i = 0; i < books.length; i++) //Find the book with the same ISBN and print it
			{
				if(books[i] != null && books[i].getISBN() == Integer.parseInt(aSearchCriteria))
				{
					librarySystemGUI.updateDisplay(books[i].toString());
				}
			}
		}
		else
		{
			librarySystemGUI.updateDisplay("Invalid search base");
		}
	}
	public static final String DELIM = "\t";
	public void save(String aFileName) //Save the database to the file
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aFileName+".txt"));
			fileWriter.println("Number of Books: " + DELIM + books.length);
			for(int i = 0; i < books.length; i++)
			{
				if(books[i] == null) //Ignore if the the slot is empty
				{
					break;
				}
				else
				{
					fileWriter.println(books[i].getName() + DELIM +
							books[i].getAuthor() + DELIM +
							books[i].getYearPublished() + DELIM +
							books[i].getPublisher() + DELIM +
							books[i].getISBN() + DELIM +
							books[i].getPageCount());
				}
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			librarySystemGUI.updateDisplay("Failed to save file.");
		}
	}
	public void load(String aFileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aFileName+".txt"));
			//Reading the header
			String fileLine = fileScanner.nextLine();
			String[] splitLines = fileLine.split(DELIM);
			if(splitLines.length != 2)
			{
				return;
			}
			int bookCount = 0;
			books = new Book[Integer.parseInt(splitLines[1])];
			while(fileScanner.hasNextLine())
			{
				//Read it
				fileLine = fileScanner.nextLine();
				//Split it
				splitLines = fileLine.split(DELIM);
				//Check it
				if(splitLines.length == 6)
				{
					//Apply it
					String name = splitLines[0];
					String author = splitLines[1];
					int yearPublished = Integer.parseInt(splitLines[2]);
					String publisher = splitLines[3];
					int ISBN = Integer.parseInt(splitLines[4]);
					int pageCount = Integer.parseInt(splitLines[5]);
					books[bookCount] = new Book(name, author, yearPublished, publisher, ISBN, pageCount);
					bookCount++;
				}
			}
			fileScanner.close();
			print();
		}
		catch(Exception e)
		{
			librarySystemGUI.updateDisplay("Failed to load file.");
		}
	}

}
