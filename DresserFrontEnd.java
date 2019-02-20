/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class DresserFrontEnd {
	
	public static Dresser dresser;
	public static Scanner keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dresser = new Dresser();
		System.out.println("Welcome to the dresser!");
		boolean done = false;
		while(done != true) //Game loop
		{
			//Decide what the user wants to do
			System.out.println("\nEnter 1 to add an item.\nEnter 2 to remove an item.\nEnter 3 to print out the dresser contents.\nEnter 9 to quit.");
			keyboard = new Scanner(System.in);
			int option = keyboard.nextInt();
			keyboard.nextLine();
			switch(option)
			{
			//Add an item
			case 1:
				System.out.println("Enter the type. It may be undergarment, socks, stockings, top, bottom, or cape.");
				String type = keyboard.nextLine();
				System.out.println("Enter a color. It may be brown, pink, orange, green, blue, purple, or grey.");
				String color = keyboard.nextLine();
				dresser.addClothing(new Clothing(type, color));
				break;
			//Remove an item
			case 2:
				System.out.print("Enter the type you wish to remove. It may be undergarment, socks, stockings, top, bottom, or cape.\n");
				type = keyboard.nextLine();
				System.out.println("Enter the color you wish to remove. It may be brown, pink, orange, green, blue, purple, or grey.");
				color = keyboard.nextLine();
				dresser.removeClothing(new Clothing(type, color));
				break;
			//Print the items
			case 3:
				System.out.println("Printing.");
				dresser.print();
				break;
			//Quit
			case 9:
				System.out.println("Cya!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid");
				break;
			}
		}
		System.out.println("Goodbye!");

	}

}
