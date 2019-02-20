/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class Lab04WithMod {

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
		int remainder = workingCopy%25;
		int quarters = (workingCopy-remainder)/25;
		workingCopy = workingCopy-(quarters*25);
		remainder = workingCopy%10;
		int dimes = (workingCopy-remainder)/10;
		workingCopy = workingCopy-(dimes*10);
		remainder = workingCopy%5;
		int nickels = (workingCopy-remainder)/5;
		workingCopy = workingCopy-(nickels*5);
		int pennies = workingCopy/1;
		System.out.println(quarters+" quarters");
		System.out.println(dimes+" dimes");
		System.out.println(nickels+" nickels");
		System.out.println(pennies+" pennies");

	}

}
