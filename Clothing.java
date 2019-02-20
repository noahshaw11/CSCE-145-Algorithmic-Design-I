/*
 * Created by Noah Shaw
 */
public class Clothing {
	//Instance variables
	private String type;
	private String color;
	//Constructors
	public Clothing()
	{
		this.type = "";
		this.color = "";
	}
	public Clothing(String aType, String aColor)
	{
		this.setType(aType);
		this.setColor(aColor);
	}
	//Accessors
	public String getType()
	{
		return this.type;
	}
	public String getColor()
	{
		return this.color;
	}
	//Mutators
	public void setType(String aType)
	{
		if(aType.equalsIgnoreCase("Undergarment") || aType.equalsIgnoreCase("Socks") || aType.equalsIgnoreCase("Stockings") || aType.equalsIgnoreCase("Top") || aType.equalsIgnoreCase("Bottom") || aType.equalsIgnoreCase("Cape"))
		{
			this.type = aType;
		}
		else
		{
			System.out.println("Invalid type.");
		}
	}
	public void setColor(String aColor)
	{
		if(aColor.equalsIgnoreCase("Brown") || aColor.equalsIgnoreCase("Red") || aColor.equalsIgnoreCase("Pink") || aColor.equalsIgnoreCase("Orange") || aColor.equalsIgnoreCase("Green") || aColor.equalsIgnoreCase("Blue") || aColor.equalsIgnoreCase("Purple") || aColor.equalsIgnoreCase("Grey"))
		{
			this.color = aColor;
		}
		else
		{
			System.out.println("Invalid color.");
		}
	}
	//Methods
	public String toString()
	{
		return "Type: "+this.type+" Color: "+this.color;
	}
	public boolean equals(Clothing aClothing)
	{
		return aClothing != null &&
				this.type.equals(aClothing.getType()) &&
				this.color.equals(aClothing.getColor());
	}

}
