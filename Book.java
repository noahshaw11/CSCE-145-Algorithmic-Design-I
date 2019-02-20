/*
 * Created by Noah Shaw
 */
public class Book {
	
	//Attributes
	private String name;
	private String author;
	private int yearPublished;
	private String publisher;
	private int ISBN;
	private int pageCount;
	
	//Constructors
	public Book() //Default
	{
		this.name = "";
		this.author = "";
		this.yearPublished = 0;
		this.publisher = "";
		this.ISBN = 0;
		this.pageCount = 0;
	}
	public Book(String aName, String aAuthor, int aYearPublished, String aPublisher, int aISBN, int aPageCount) //Parameter
	{
		this.setName(aName);
		this.setAuthor(aAuthor);
		this.setYearPublished(aYearPublished);
		this.setPublisher(aPublisher);
		this.setISBN(aISBN);
		this.setPageCount(aPageCount);
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public int getYearPublished()
	{
		return this.yearPublished;
	}
	public String getPublisher()
	{
		return this.publisher;
	}
	public int getISBN()
	{
		return this.ISBN;
	}
	public int getPageCount()
	{
		return this.pageCount;
	}
	
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setAuthor(String aAuthor)
	{
		this.author = aAuthor;
	}
	public void setYearPublished(int aYearPublished)
	{
		this.yearPublished = aYearPublished;
	}
	public void setPublisher(String aPublisher)
	{
		this.publisher = aPublisher;
	}
	public void setISBN(int aISBN)
	{
		this.ISBN = aISBN;
	}
	public void setPageCount(int aPageCount)
	{
		this.pageCount = aPageCount;
	}
	
	//Methods
	public String toString()
	{
		return "Name: "+this.name+" Author: "+this.author+" Year Published: "+this.yearPublished+" Publisher: "+this.publisher+" ISBN: "+this.ISBN+" Page Count: "+this.pageCount+"\n";
	}
	public boolean equals(Book aBook)
	{
		return aBook != null &&
				this.name.equalsIgnoreCase(aBook.getName()) &&
				this.author.equalsIgnoreCase(aBook.getAuthor()) &&
				this.yearPublished == aBook.getYearPublished() &&
				this.publisher.equalsIgnoreCase(aBook.getPublisher()) &&
				this.ISBN == aBook.getISBN() &&
				this.pageCount == aBook.getPageCount();
	}

}
