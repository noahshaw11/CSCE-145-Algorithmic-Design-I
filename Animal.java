/*
 * Created by Noah Shaw
 */
public class Animal {
	
	//Attributes
	private String name;
	private double weight;
	
	//Constructors
	public Animal() //Default
	{
		this.name = "Bob";
		this.weight = 1.0;
	}
	public Animal(String aName, double aWeight) //Parameter
	{
		this.setName(aName);
		this.setWeight(aWeight);
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
	
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setWeight(double aWeight)
	{
		if(aWeight > 0)
		{
			this.weight = aWeight;
		}
	}
	
	//Methods
	public String toString()
	{
		return "Name: "+this.name+" Weight: "+this.weight;
	}
	public boolean equals(Animal aAnimal)
	{
		return aAnimal != null &&
				this.name.equalsIgnoreCase(aAnimal.getName()) &&
				this.weight == aAnimal.getWeight();
	}

}
