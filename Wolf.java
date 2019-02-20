/*
 * Created by Noah Shaw
 */
public class Wolf extends Dog {
	
	//Attributes
	private String packLeaderName;
	
	//Constructors
	public Wolf() //Default
	{
		super();
		this.packLeaderName = "Alpha";
	}
	public Wolf(String aName, double aWeight, int aEnergyLevel, String aPackLeaderName) //Parameter
	{
		super(aName, aWeight, aEnergyLevel);
		this.setPackLeaderName(aPackLeaderName);
	}
	
	//Accessors
	public String getPackLeaderName()
	{
		return this.packLeaderName;
	}
	
	//Mutators
	public void setPackLeaderName(String aPackLeaderName)
	{
		this.packLeaderName = aPackLeaderName;
	}
	
	//Methods
	public String toString()
	{
		return super.toString()+" Pack Leader Name: "+this.packLeaderName;
	}
	public boolean equals(Wolf aWolf)
	{
		return aWolf != null &&
				super.equals(aWolf) &&
				this.packLeaderName.equalsIgnoreCase(aWolf.getPackLeaderName());
	}

}
