/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gather information
		System.out.println("We are going to collect some VERY personal information from you. Do not be alarmed.");
		System.out.println("Please enter your name.");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		System.out.println("Please enter your age.");
		int age = keyboard.nextInt();
		System.out.println("Please enter your height in meters.");
		double height = keyboard.nextDouble();
		System.out.println("Please enter your blood type.");
		String bloodType = keyboard.next();
		System.out.println("Are you a cat person? True or false.");
		boolean catPerson = keyboard.nextBoolean();
		System.out.println("Are you a dog person? True or false.");
		boolean dogPerson = keyboard.nextBoolean();
		System.out.println("Are you a shape shifting reptilian? True or false.");
		boolean shapeShifter = keyboard.nextBoolean();
		System.out.println("How much gold, in kilograms, do you have buried on your land?");
		double gold = keyboard.nextDouble();
		  
		//Display gathered information
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height);
		System.out.println("Blood Type: "+bloodType);
		System.out.println("Cat Person: "+catPerson);
		System.out.println("Dog Person: "+dogPerson);
		System.out.println("Shape Shifting Reptilian: "+shapeShifter);
		System.out.println("Amount of Gold Buried on Your Land: "+gold);

	}

}
