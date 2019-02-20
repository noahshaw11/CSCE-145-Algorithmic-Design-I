/*
 * Written by Noah Shaw
 */
public class SineLine implements Line {
	
	//Instance variables
	private double amplitude;
	private double frequency;
	
	//Constructors
	public SineLine()
	{
		this.amplitude = 0.0;
		this.frequency = 0.0;
	}
	public SineLine(double aAmplitude, double aFrequency)
	{
		this.setAmplitude(aAmplitude);
		this.setFrequency(aFrequency);
	}
	
	//Accessors
	public double getAmplitude()
	{
		return this.amplitude;
	}
	public double getFrequency()
	{
		return this.frequency;
	}
	
	//Mutators
	public void setAmplitude(double aAmplitude)
	{
		this.amplitude = aAmplitude;
	}
	public void setFrequency(double aFrequency)
	{
		this.frequency = aFrequency;
	}
	
	//Methods
	public double getYPoint(double aXCoord)
	{
		double yCoord = this.amplitude * Math.sin(aXCoord * this.frequency);
		return yCoord;
	}

}
