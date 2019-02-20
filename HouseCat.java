/*
 * Created by Noah Shaw
 */
public class HouseCat extends Cat {
	
	//Attributes
	private String type;
	
	//Constructors
	public HouseCat() //Default
	{
		super();
		this.type = "Short Hair";
	}
	public HouseCat(String aName, double aWeight, String aMood, String aType) //Parameter
	{
		super(aName, aWeight, aMood);
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
		if(aType.equalsIgnoreCase("Short Hair") || aType.equalsIgnoreCase("Bombay") || aType.equalsIgnoreCase("Ragdoll") || aType.equalsIgnoreCase("Sphinx") || aType.equalsIgnoreCase("Scottish Fold"))
		{
			this.type = aType;
		}
	}
	
	//Methods
	public String toString()
	{
		return super.toString()+" Type: "+this.type;
	}
	public boolean equals(HouseCat aHouseCat)
	{
		return aHouseCat != null &&
				super.equals(aHouseCat) &&
				this.type.equalsIgnoreCase(aHouseCat.getType());
	}

}
