/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class Lab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gather initial information
		System.out.println("Would you like to throw something? Of course you would!");
		System.out.println("What is the name of the object we are going to throw?");
		Scanner keyboard = new Scanner(System.in);
		String nameOfObject = keyboard.nextLine();
		System.out.println("What is "+nameOfObject+"'s initial velocity (m/s) in the X direction?");
		double xDirectionInitialVelocity = keyboard.nextInt();
		System.out.println("What is "+nameOfObject+"'s initial velocity (m/s) in the Y direction?");
		double yDirectionInitialVelocity = keyboard.nextDouble();
		System.out.println("How much time (s) has elapsed?");
		double time = keyboard.nextDouble();
		//Perform mathematical operations to get the location of the object
		double xPosition = (xDirectionInitialVelocity*time);
		double yPosition = ((yDirectionInitialVelocity*time)+(.5*-9.81*(time*time)));
		System.out.println(nameOfObject+" is at location (m) ("+xPosition+", "+yPosition+").");

	}

}
