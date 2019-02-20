import java.util.Scanner;
public class TacoManFrontEnd {

	public static TacoManager tacoMan;
	public static Scanner keyboard;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tacoMan = new TacoManager();
		keyboard = new Scanner(System.in);
		greeting();
		printOptions();
		int option = keyboard.nextInt();
		switch(option)
		{
		case 1:
			//TODO add
			addTaco();
			break;
		case 2:
			//TODO remove
			break;
		case 3:
			//TODO sort
			break;
		case 9:
			System.exit(0);
		default:
			System.out.println("Invalid");
		}
	}
	public static void greeting()
	{
		System.out.println("HEY!");
	}
	public static void printOptions()
	{
		System.out.println("Enter 1: to add \nEnter 2: to remove \nEnter 3: to sort \nEnter 9: to quit");
		
	}
	public static void addTaco()
	{
		System.out.println("Enter the name, location, and price");
		String name = keyboard.nextLine();
		String loc = keyboard.nextLine();
		double price = keyboard.nextDouble();
		tacoMan.addTaco(new Taco(name,loc,price));
	}

}
