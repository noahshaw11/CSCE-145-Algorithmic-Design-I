/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's coffee!");
		Coffee firstCoffee = new Coffee();
		Coffee secondCoffee = new Coffee();
		System.out.println("What's the name of the first coffee?");
		Scanner keyboard = new Scanner(System.in);
		firstCoffee.setName(keyboard.nextLine());
		System.out.println("What's the caffeine content?");
		firstCoffee.setCaffeine(keyboard.nextInt());
		System.out.println("");
		keyboard.nextLine();
		System.out.println("What's the name of the second coffee?");
		secondCoffee.setName(keyboard.nextLine());
		System.out.println("What's the caffeine content?");
		secondCoffee.setCaffeine(keyboard.nextInt());
		System.out.println("It would take "+firstCoffee.RiskyAmount()+" "+firstCoffee.getName()+" coffees before it's dangerous to drink more.");
		System.out.println("It would take "+secondCoffee.RiskyAmount()+" "+secondCoffee.getName()+" coffees before it's dangerous to drink more.");
		System.out.println("Cya!");

	}

}
