/*
 * Created by Noah Shaw
 */
public class DaySchedule {
	
	//Instance variables
	private Activity[] activities;
	public static final int numOfActivities = 20;
	
	//Constructors
	public DaySchedule()
	{
		activities = new Activity[numOfActivities];
	}
	
	//No Accessors needed
	
	//No Mutators needed
	
	//Methods
	public void addActivity(Activity aActivity)
	{
		if(activities[activities.length - 1] != null)
		{
			System.out.println("Sorry the schedule is full.");
			return;
		}
		else
		{
			for(int i = 0; i < activities.length; i++)
			{
				if(activities[i] == null)
				{
					activities[i] = aActivity;
					break;
				}
				else if(activities[i].getStartHour() == aActivity.getStartHour() || activities[i].getEndHour() == aActivity.getEndHour())
				{
					System.out.println("You already have something scheduled for that time.");
					break;
				}
			}
		}
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int j = 0; j < activities.length - 1; j++)
			{
				if(activities[j] == null || activities[j+1] == null)
				{
					break;
				}
				else if(activities[j].getStartHour() > activities[j+1].getStartHour())
				{
					//Swap
					Activity temp = activities[j];
					activities[j] = activities[j+1];
					activities[j+1] = temp;
					hasSwapped = true;
					break;
				}
			}
		}
	}
	public void removeActivity(Activity aActivity)
	{
		int rmIndex = -1; //Sentinel value
		for(int i = 0; i < activities.length; i++)
		{
			if(activities[i] != null && activities[i].getName().equalsIgnoreCase(aActivity.getName()))
			{
				rmIndex = i;
				break;
			}
		}
		if(rmIndex == -1)
		{
			System.out.println("That activity does not exist.");
			return;
		}
		for(int i = rmIndex; i < activities.length - 1; i++)
		{
			activities[i] = activities[i+1];
		}
		activities[activities.length - 1] = null;
	}
	public void printActivities()
	{
		System.out.println();
		System.out.println("CURRENT SCHEDULE");
		for(int i = 0; i < activities.length; i++)
		{
			if(activities[i] == null)
			{
				break;
			}
			System.out.println(activities[i]);
		}
	}

}
