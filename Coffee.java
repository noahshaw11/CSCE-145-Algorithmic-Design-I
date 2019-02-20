/*
 * Created by Noah Shaw
 */
public class Coffee {
	//Instance variables
	private String name = "None";
	private int caffeine = 0;
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public int getCaffeine()
	{
		return this.caffeine;
	}
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setCaffeine(int aCaffeine)
	{
		if(aCaffeine >= 50 && aCaffeine <= 300)
		{
			this.caffeine = aCaffeine;
		}
	}
	//Methods
	public double RiskyAmount()
	{
		double amountOfCups = 180.0/((this.getCaffeine()/100.0)*6.0);
		return amountOfCups;
	}

}
