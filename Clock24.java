/*
 * Created by Noah Shaw
 */
public class Clock24 {
	
	//Attributes
	private int hours;
	private int minutes;
	private boolean isAM;
	
	//Constructors
	public Clock24()
	{
		this.hours = 0;
		this.minutes = 0;
		this.isAM = true;
	}
	public Clock24(int aHours, int aMinutes)
	{
		this.setHours(aHours);
		this.setMinutes(aMinutes);
	}
	
	//Accessors
	public int getHours()
	{
		return this.hours;
	}
	public int getMinutes()
	{
		return this.minutes;
	}
	public boolean getIsAM()
	{
		return this.isAM;
	}
	
	//Mutators
	public void setHours(int aHours)
	{
		if(aHours >= 0 && aHours <= 23)
		{
			this.hours = aHours;
		}
	}
	public void setMinutes(int aMinutes)
	{
		if(aMinutes >= 0 && aMinutes <= 59)
		{
			this.minutes = aMinutes;
		}
	}
	public void setIsAM(boolean aIsAM)
	{
		this.isAM = aIsAM;
	}
	
	//Methods
	public void setTime(int aHours, int aMinutes)
		throws TimeFormatException
	{
		if(aHours < 0 || aMinutes > 59)
		{
			throw new TimeFormatException();
		}
		if(aHours == 12)
		{
			aHours = 12;
			this.setIsAM(true);
		}
		else if(aHours > 12)
		{
			aHours = aHours - 12;
			this.setIsAM(false);
		}
		else if(aHours < 12)
		{
			this.setIsAM(true);
		}
		this.setHours(aHours);
		this.setMinutes(aMinutes);
	}
	public void setTime(String aString)
		throws TimeFormatException
	{
		try
		{
			int aHours = Integer.parseInt(aString.substring(0, aString.indexOf(":")));
			int aMinutes = Integer.parseInt(aString.substring(aString.indexOf(":") + 1, aString.length()));
			this.setTime(aHours, aMinutes);
		}
		catch(TimeFormatException e)
		{
			System.out.println("EXCEPTION: Incorrect time!");
		}
		catch(Exception e)
		{
			System.out.println("EXCEPTION: Wrong format!");
		}
	}
	public void printTime()
	{
		String amPm = "";
		if(this.isAM == true)
		{
			amPm = "AM";
		}
		else if(this.isAM == false)
		{
			amPm = "PM";
		}
		String minutes = "";
		if(this.minutes == 0)
		{
			minutes = "00";
		}
		else
		{
			minutes = Integer.toString(this.minutes);
		}
		System.out.println(this.hours+":"+minutes+" "+amPm);
	}

}
