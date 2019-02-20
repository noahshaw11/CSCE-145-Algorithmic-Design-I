/*
 * Created by Noah Shaw
 */
public class Activity {
	
	//Instance variables
	private String name;
	private int startHour;
	private int endHour;
	
	//Constructors
	public Activity()
	{
		this.name = "rest";
		this.startHour = 1;
		this.endHour = 1;
	}
	public Activity(String aName, int aStartHour, int aEndHour)
	{
		this.setName(aName);
		this.setStartHour(aStartHour);
		this.setEndHour(aEndHour);
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public int getStartHour()
	{
		return this.startHour;
	}
	public int getEndHour()
	{
		return this.endHour;
	}
	
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setStartHour(int aStartHour)
	{
		if(aStartHour >= 0 && aStartHour <= 23)
		{
			this.startHour = aStartHour;
		}
	}
	public void setEndHour(int aEndHour)
	{
		if(aEndHour >= 0 && aEndHour <= 23)
		{
			this.endHour = aEndHour;
		}
	}
	
	//Methods
	public String toString()
	{
		return "Name: "+this.name+" Start Hour: "+this.startHour+" End Hour: "+this.endHour;
	}

}
