/*
 * Written by Noah Shaw
 */
public class SlopedLine implements Line {
	
	//Instance variables
	private double slope;
	
	//Constructors
	public SlopedLine()
	{
		this.slope = 0.0;
	}
	public SlopedLine(double aSlope)
	{
		this.setSlope(aSlope);
	}
	
	//Accessors
	public double getSlope()
	{
		return this.slope;
	}
	
	//Mutators
	public void setSlope(double aSlope)
	{
		this.slope = aSlope;
	}
	
	//Methods
	public double getYPoint(double aXCoord)
	{
		double yCoord = this.slope * aXCoord;
		return yCoord;
	}

}
