/*
 * Created by Noah Shaw
 */
public class Truck extends Vehicle {
	//Attributes
	private double loadCap;
	private double towCap;
	//Constructors
	public Truck()
	{
		super();
		this.loadCap = 0;
		this.towCap = 0;
	}
	public Truck(String aManuName, int aCylinders, String aOwnersName, double aLoadCap, double aTowCap)
	{
		super(aManuName, aCylinders, aOwnersName);
		this.setLoadCap(aLoadCap);
		this.setTowCap(aTowCap);
	}
	//Accessors
	public double getLoadCap()
	{
		return this.loadCap;
	}
	public double getTowCap()
	{
		return this.towCap;
	}
	//Mutators
	public void setLoadCap(double aLoadCap)
	{
		if(aLoadCap >= 0)
		{
			this.loadCap = aLoadCap;
		}
	}
	public void setTowCap(double aTowCap)
	{
		if(aTowCap >= 0)
		{
			this.towCap = aTowCap;
		}
	}
	//Methods
	public boolean equals(Truck aTruck)
	{
		return aTruck != null &&
				super.equals(aTruck) &&
				this.loadCap == aTruck.getLoadCap() &&
				this.towCap == aTruck.getTowCap();
	}
	public String toString()
	{
		return super.toString()+"\nLoad Capacity: "+this.loadCap+"\nTowing Capacity: "+this.towCap;
	}

}
