/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class DayScheduleFrontEnd {
	
	public static DaySchedule daySchedule;
	public static Scanner keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		daySchedule = new DaySchedule();
		boolean done = false;
		while(done != true)
		{
			System.out.println("Would you like to:"
					+ "\n1. Add an activity"
					+ "\n2. Remove an activity"
					+ "\n3. Quit");
			keyboard = new Scanner(System.in);
			int option = keyboard.nextInt();
			keyboard.nextLine();
			switch(option)
			{
			case 1:
				System.out.println("Enter the activity's name.");
				String name = keyboard.nextLine();
				System.out.println("Enter its start hour in military time.");
				int startHour = keyboard.nextInt();
				System.out.println("Enter its end hour in military time.");
				int endHour = keyboard.nextInt();
				daySchedule.addActivity(new Activity(name, startHour, endHour));
				break;
			case 2:
				System.out.println("Enter the activity's name.");
				name = keyboard.nextLine();
				daySchedule.removeActivity(new Activity(name, 0, 0));
				break;
			case 3:
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid");
			}
			daySchedule.printActivities();
		}

	}

}
