
public class Cat { //Define the class
	//Instance variables
	private String name;
	private double weight;
	private int numLegs;
	//Constructors
	public Cat() //Default
	{
		this.name = "no name yet";
		this.weight = 1.0;
		this.numLegs = 4;
	}
	public Cat(String aName, double aWeight, int aNumlegs) //Parameterized constructor
	{
		//TODO Call mutators
	}
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public int getNumLegs()
	{
		return this.numLegs;
	}
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setWeight(double aWeight)
	{
		if(aWeight > 0.0)
		{
			this.weight = aWeight;
		}
	}
	public void setNumLegs(int aNumLegs)
	{
		if(aNumLegs >= 0 && aNumLegs <= 4)
		{
			this.numLegs = aNumLegs;
		}
	}
	//Other methods
	public String toString()
	{
		return this.name + " " + this.weight + " " + this.numLegs;
	}
	public boolean equals(Cat thatCat)
	{
		return thatCat != null &&
				this.name.equals(thatCat.getName()) &&
				this.weight == thatCat.getWeight() &&
				this.numLegs == thatCat.getNumLegs();
	}

}
