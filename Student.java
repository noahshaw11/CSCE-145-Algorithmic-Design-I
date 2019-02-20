
public class Student extends Person //Extends is inheritance or "is a"
{
	private int id;
	public Student()
	{
		super(); //Call to the Person's default constructor
		this.id = 0;
	}
	public Student(String aName, int aID)
	{
		super(aName); //Call to person's parameterized constructor
		//TODO Call Mutators
		this.setID(aID);
	}
	public int getID()
	{
		return this.id;
	}
	public void setID(int aID)
	{
		if(aID >= 0)
		{
			this.id = aID;
		}
	}
	public String toString() //Overriding
	{
		return super.toString()+"\nID: "+this.id;
	}
	public boolean equals(Student aStudent)
	{
		return aStudent != null &&
				super.equals(aStudent) && //Student is a person too
				this.id == aStudent.getID();
	}

}
