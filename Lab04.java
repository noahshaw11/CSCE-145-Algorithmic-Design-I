/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class Lab04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prompt the user to input a whole number
		System.out.println("Enter a whole number from 1 to 99.");
		System.out.println("The machine will determine a combination of coins.");
		Scanner keyboard = new Scanner(System.in);
		//Assign the input to a variable and create a copy of that variable
		int coin = keyboard.nextInt();
		int workingCopy = coin;
		//Determine how many whole quarters make up the input and subtract it from the input
		int quarters = workingCopy/25;
		workingCopy = (workingCopy-(25*quarters));
		//Determine how many whole dimes make up the input and subtract it from the input
		int dimes = workingCopy/10;
		workingCopy = (workingCopy-(10*dimes));
		//Determine how many whole nickels make up the input and subtract it from the input
		int nickels = workingCopy/5;
		workingCopy = (workingCopy-(5*nickels));
		//Determine how many whole pennies make up the input
		int pennies = workingCopy/1;
		//Display the input and how many of the different types of coins make up the input
		System.out.println(coin+" cents in coins is: ");
		System.out.println(quarters+" quarters");
		System.out.println(dimes+" dimes");
		System.out.println(nickels+" nickels");
		System.out.println(pennies+" pennies");
		
	}

}
