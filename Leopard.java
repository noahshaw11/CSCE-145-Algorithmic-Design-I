/*
 * Created by Noah Shaw
 */
public class Leopard extends Cat {
	
	//Attributes
	private int numberOfSpots;
	
	//Constructors
	public Leopard() //Default
	{
		super();
		this.numberOfSpots = 0;
	}
	public Leopard(String aName, double aWeight, String aMood, int aNumberOfSpots) //Parameter
	{
		super(aName, aWeight, aMood);
		this.setNumberOfSpots(aNumberOfSpots);
	}
	
	//Accessors
	public int getNumberOfSpots()
	{
		return this.numberOfSpots;
	}
	
	//Mutators
	public void setNumberOfSpots(int aNumberOfSpots)
	{
		if(aNumberOfSpots >= 0)
		{
			this.numberOfSpots = aNumberOfSpots;
		}
	}
	
	//Methods
	public String toString()
	{
		return super.toString()+" Number Of Spots: "+this.numberOfSpots;
	}
	public boolean equals(Leopard aLeopard)
	{
		return aLeopard != null &&
				super.equals(aLeopard) &&
				this.numberOfSpots == aLeopard.getNumberOfSpots();
	}

}
