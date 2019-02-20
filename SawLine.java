/*
 * Written by Noah Shaw
 */
public class SawLine implements Line {
	
	//Instance variables
	private double modValue;
	
	//Constructors
	public SawLine()
	{
		this.modValue = 0.0;
	}
	public SawLine(double aModValue)
	{
		this.setModValue(aModValue);
	}
	
	//Accessors
	public double getModValue()
	{
		return this.modValue;
	}
	
	//Mutators
	public void setModValue(double aModValue)
	{
		this.modValue = aModValue;
	}
	
	//Methods
	public double getYPoint(double aXCoord)
	{
		double yCoord = aXCoord % this.modValue;
		return yCoord;
	}

}
