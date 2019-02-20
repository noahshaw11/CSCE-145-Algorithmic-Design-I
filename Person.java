
public class Person {
	private String name;
	public Person()
	{
		this.name = "none";
	}
	public Person(String aName)
	{
		this.setName(aName);
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String aName)
	{
		this.name = aName;
	}
	public String toString()
	{
		return "Name: "+this.name;
	}
	public boolean equals(Person aPerson)
	{
		return aPerson != null &&
				this.name.equals(aPerson.getName());
	}

}
