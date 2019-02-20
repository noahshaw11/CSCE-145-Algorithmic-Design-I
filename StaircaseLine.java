/*
 * Written by Noah Shaw
 */
public class StaircaseLine implements Line {
	
	//Instance variables
	private double width;
	private double height;
	
	//Constructors
	public StaircaseLine()
	{
		this.width = 0.0;
		this.height = 0.0;
	}
	public StaircaseLine(double aWidth, double aHeight)
	{
		this.setWidth(aWidth);
		this.setHeight(aHeight);
	}
	
	//Accessors
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	
	//Mutators
	public void setWidth(double aWidth)
	
	{
		this.width = aWidth;
	}
	public void setHeight(double aHeight)
	{
		this.height = aHeight;
	}
	
	//Methods
	public double getYPoint(double aXCoord)
	{
		double yCoord = ((int)aXCoord / (int)this.width) * this.height;
		return yCoord;
	}

}
