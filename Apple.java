/*
 * Created by Noah Shaw
 */
public class Apple {
	//Attributes
	private String type;
	private double weight;
	private double price;
	//Constructors
	public Apple() //Default
	{
		this.type = "Gala";
		this.weight = 0.5;
		this.price = 0.89;
	}
	public Apple(String aType, double aWeight, double aPrice) //Parameter instructor
	{
		//Call mutators
		this.setType(aType);
		this.setWeight(aWeight);
		this.setPrice(aPrice);
	}
	//Accessors
	public String getType()
	{
		return this.type;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public double getPrice()
	{
		return this.price;
	}
	//Mutators
	public void setType(String aType)
	{
		if(aType.equalsIgnoreCase("Red Delicious") || aType.equalsIgnoreCase("Golden Delicious") || aType.equalsIgnoreCase("Gala") || aType.equalsIgnoreCase("Granny Smith"))
		{
			this.type = aType;
		}
		else
		{
			System.out.println("Invalid type.");
			this.type = "Gala";
		}
	}
	public void setWeight(double aWeight)
	{
		if(aWeight > 0 && aWeight < 2)
		{
			this.weight = aWeight;
		}
		else
		{
			System.out.println("Invalid weight.");
			this.weight = 0.5;
		}
	}
	public void setPrice (double aPrice)
	{
		if(aPrice > 0)
		{
			this.price = aPrice;
		}
		else
		{
			System.out.println("Invalid price.");
			this.price = 0.89;
		}
	}
	//Methods
	public String toString()
	{
		return "Name: "+this.type+" Weight: "+this.weight+" Price: "+this.price;
	}
	public boolean equals(Apple aApple)
	{
		return aApple != null &&
			this.type.equals(aApple.getType()) &&
			this.weight == aApple.getWeight() &&
			this.price == aApple.getPrice();
	}

}
