/*
 * Created by Noah Shaw
 */
public class Dog extends Animal {
	
	//Attributes
	private int energyLevel;
	
	//Constructors
	public Dog() //Default
	{
		super();
		this.energyLevel = 0;
	}
	public Dog(String aName, double aWeight, int aEnergyLevel) //Parameter
	{
		super(aName, aWeight);
		this.setEnergyLevel(aEnergyLevel);
	}
	
	//Accessors
	public int getEnergyLevel()
	{
		return this.energyLevel;
	}
	
	//Mutators
	public void setEnergyLevel(int aEnergyLevel)
	{
		if(aEnergyLevel >= 0 && aEnergyLevel <= 100)
		{
			this.energyLevel = aEnergyLevel;
		}
	}
	
	//Methods
	public String toString()
	{
		return super.toString()+" Energy Level: "+this.energyLevel;
	}
	public boolean equals(Dog aDog)
	{
		return aDog != null &&
				super.equals(aDog) &&
				this.energyLevel == aDog.getEnergyLevel();
	}

}
