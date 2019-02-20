/*
 * Created by Noah Shaw
 */
public class Car extends Vehicle {
	//Attributes
	private double mileage;
	private int passengers;
	//Constructors
	public Car()
	{
		super();
		this.mileage = 0.0;
		this.passengers = 0;
	}
	public Car(String aManuName, int aCylinders, String aOwnersName, double aMileage, int aPassengers)
	{
		super(aManuName, aCylinders, aOwnersName);
		this.setMileage(aMileage);
		this.setPassengers(aPassengers);
	}
	//Accessors
	public double getMileage()
	{
		return this.mileage;
	}
	public double getPassengers()
	{
		return this.passengers;
	}
	//Mutators
	public void setMileage(double aMileage)
	{
		if(aMileage >= 0)
		{
			this.mileage = aMileage;
		}
	}
	public void setPassengers(int aPassengers)
	{
		if(aPassengers >= 0)
		{
			this.passengers = aPassengers;
		}
	}
	//Methods
	public boolean equals(Car aCar)
	{
		return aCar != null &&
				super.equals(aCar) &&
				this.mileage == aCar.getMileage() &&
				this.passengers == aCar.getPassengers();
	}
	public String toString()
	{
		return super.toString()+"\nMileage: "+this.mileage+"\nPassengers: "+this.passengers;
	}

}
