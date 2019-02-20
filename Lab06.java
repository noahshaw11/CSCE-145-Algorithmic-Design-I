/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
import java.util.Random;
public class Lab06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prompt the user to input how many times to roll
		System.out.println("Enter the number of times you would like to roll a six sided dice.");
		Scanner keyboard = new Scanner(System.in);
		int timesToRoll = keyboard.nextInt();
		//If the user enters a negative number, end the program
		if(timesToRoll < 0)
		{
			System.out.println("Sorry, you can't roll a dice a negative number of times.");
			System.exit(0);
		}
		//Declare variables
		int timesRolled = 0;
		int roll = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		//Perform the rolls and keep track of the amount of times a number is rolled
		while(timesRolled<timesToRoll)
		{
			Random rand = new Random();
			roll = rand.nextInt(6)+1;
			if(roll==1)
			{
				ones++;
			}
			else if(roll==2)
			{
				twos++;
			}
			else if(roll==3)
			{
				threes++;
			}
			else if(roll==4)
			{
				fours++;
			}
			else if(roll==5)
			{
				fives++;
			}
			else if(roll==6)
			{
				sixes++;
			}
			System.out.println("A "+roll+" was rolled.");
			timesRolled++;
		}
		//Print the results of the rolls
		System.out.println("");
		System.out.println("A one was rolled "+ones+" times.");
		System.out.println("A two was rolled "+twos+" times.");
		System.out.println("A three was rolled "+threes+" times.");
		System.out.println("A four was rolled "+fours+" times.");
		System.out.println("A five was rolled "+fives+" times.");
		System.out.println("A six was rolled "+sixes+" times.");

	}

}
