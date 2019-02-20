/*
 * Created by Noah Shaw
 */
public class Vehicle {
	//Attributes
	private String manuName;
	private int cylinders;
	private String ownersName;
	//Constructors
	public Vehicle()
	{
		this.manuName = "";
		this.cylinders = 0;
		this.ownersName = "";
	}
	public Vehicle(String aManuName, int aCylinders, String aOwnersName)
	{
		this.setManuName(aManuName);
		this.setCylinders(aCylinders);
		this.setOwnersName(aOwnersName);
	}
	//Accessors
	public String getManuName()
	{
		return this.manuName;
	}
	public int getCylinders()
	{
		return this.cylinders;
	}
	public String getOwnersName()
	{
		return this.ownersName;
	}
	//Mutators
	public void setManuName(String aName)
	{
		this.manuName = aName;
	}
	public void setCylinders(int aCylinders)
	{
		if(aCylinders > 0)
		{
			this.cylinders = aCylinders;
		}
	}
	public void setOwnersName(String aOwnersName)
	{
		this.ownersName = aOwnersName;
	}
	//Methods
	public boolean equals(Vehicle aVehicle)
	{
		return aVehicle != null &&
				this.manuName.equals(aVehicle.getManuName()) &&
				this.cylinders == aVehicle.getCylinders() &&
				this.ownersName.equals(aVehicle.getOwnersName());
	}
	public String toString()
	{
		return "Manufacturer's Name: "+this.manuName+"\nNumber of Cylinders: "+this.cylinders+"\nOwner's Name: "+this.ownersName;
	}

}
