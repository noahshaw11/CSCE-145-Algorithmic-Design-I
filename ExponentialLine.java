/*
 * Written by Noah Shaw
 */
public class ExponentialLine implements Line {
	
	//Instance variables
	private double exponent;
	
	//Constructors
	public ExponentialLine()
	{
		this.exponent = 0.0;
	}
	public ExponentialLine(double aExponent)
	{
		this.setExponent(aExponent);
	}
	
	//Accessors
	public double getExponent()
	{
		return this.exponent;
	}
	
	//Mutators
	public void setExponent(double aExponent)
	{
		this.exponent = aExponent;
	}
	
	//Methods
	public double getYPoint(double aXCoord)
	{
		double yCoord = Math.pow(aXCoord, this.exponent);
		return yCoord;
	}

}
