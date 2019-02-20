/*
 * Created by Noah Shaw
 */
public class DomesticDog extends Dog {
	
	//Attributes
	private String type;
	
	//Constructors
	public DomesticDog() //Default
	{
		super();
		this.type = "Retriever";
	}
	public DomesticDog(String aName, double aWeight, int aEnergyLevel, String aType) //Parameter
	{
		super(aName, aWeight, aEnergyLevel);
		this.setType(aType);
	}
	
	//Accessors
	public String getType()
	{
		return this.type;
	}
	
	//Mutators
	public void setType(String aType)
	{
		if(aType.equalsIgnoreCase("Retriever") || aType.equalsIgnoreCase("Terrier") || aType.equalsIgnoreCase("Husky") || aType.equalsIgnoreCase("Yappy") || aType.equalsIgnoreCase("Mutt"))
		{
			this.type = aType;
		}
	}
	
	//Methods
	public String toString()
	{
		return super.toString()+" Type: "+this.type;
	}
	public boolean equals(DomesticDog aDomesticDog)
	{
		return aDomesticDog != null &&
				super.equals(aDomesticDog) &&
				this.type.equalsIgnoreCase(aDomesticDog.getType());
	}

}
