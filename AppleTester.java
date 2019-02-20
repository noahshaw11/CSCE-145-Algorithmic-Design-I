/*
 * Created by Noah Shaw
 */
public class AppleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Apple Tester.\n");
		System.out.println("Creating a default apple.");
		Apple apple01 = new Apple();
		System.out.println("Printing the default apple's values.");
		System.out.println(apple01);
		System.out.println("\nCreating another apple.");
		Apple apple02 = new Apple("Red", 1.9, 1.0);
		System.out.println("Setting the new apple's values to the following valid values "+apple02.toString()+".");
		System.out.println("Printing the new apple's values.");
		System.out.println(apple02.toString());
		System.out.println("\nCreating another apple.");
		Apple apple03 = new Apple("Red Delicious", 1.0, 200.0);
		//System.out.println("Printing the apple's values which should have not changed from the default values.");
		System.out.println(apple03.toString());

	}

}
