/*
 * Created by Noah Shaw
 */
public class Box {
	//Instance variables
	private String label;
	private double length;
	private double width;
	private double height;
	//Constructors
	public Box()
	{
		this.label = "None";
		this.length = 1.0;
		this.width = 1.0;
		this.height = 1.0;
	}
	public Box(String aLabel, double aLength, double aWidth, double aHeight)
	{
		this.setLabel(aLabel);
		this.setLength(aLength);
		this.setWidth(aWidth);
		this.setHeight(aHeight);
	}
	//Accessors
	public String getLabel()
	{
		return this.label;
	}
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	//Mutators
	public void setLabel(String aLabel)
	{
		this.label = aLabel;
	}
	public void setLength(double aLength)
	{
		if(aLength > 0)
		{
			this.length = aLength;
		}
		else
		{
			System.out.println("Invalid length.");
		}
	}
	public void setWidth(double aWidth)
	{
		if(aWidth > 0)
		{
			this.width = aWidth;
		}
		else
		{
			System.out.println("Invalid width.");
		}
	}
	public void setHeight(double aHeight)
	{
		if(aHeight > 0)
		{
			this.height = aHeight;
		}
		else
		{
			System.out.println("Invalid height.");
		}
	}
	//Other methods
	public double getVolume()
	{
		return this.length * this.width * this.height;
	}
	public String toString()
	{
		return this.label + ": " + (this.length * this.width * this.height);
	}

}
