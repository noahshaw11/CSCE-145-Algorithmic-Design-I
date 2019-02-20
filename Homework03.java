/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
import java.util.Random;
public class Homework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prompt the user to input what their hand will be
		System.out.println("Time to play Rock, Paper, Scissors! Best 2 out of 3! Good luck!");
		//Create variables to track the amount of wins
		String playerResponse = "";
		int computerResponseInt = 0;
		String computerResponse = "";
		int playerWins = 0;
		int computerWins = 0;
		Scanner keyboard = new Scanner(System.in);
		//Game loop
		for(int rounds = 1; rounds <= 3; rounds++)
		{
			System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\".");
			playerResponse = keyboard.nextLine();
			if(!(playerResponse.equalsIgnoreCase("Rock") || playerResponse.equalsIgnoreCase("Paper") || playerResponse.equalsIgnoreCase("Scissors")))
			{
				System.out.println("That was not a correct input. The computer has gained a point!");
				computerWins++;
			}
			//Draw a random integer to reference the computer's hand
			Random rand = new Random();
			computerResponseInt = rand.nextInt(3)+1;
			//Assign computer's response based on the random integer
			if(computerResponseInt == 1)
			{
				computerResponse = "Rock";
			}
			else if(computerResponseInt == 2)
			{
				computerResponse = "Paper";
			}
			else if(computerResponseInt == 3)
			{
				computerResponse = "Scissors";
			}
			//Determine winner
			if(playerResponse.equalsIgnoreCase("Rock") && computerResponse.equals("Paper"))
			{
				System.out.println(playerResponse+" vs. "+computerResponse);
				System.out.println("The computer wins!");
				computerWins++;
			}
			else if(playerResponse.equalsIgnoreCase("Paper") && computerResponse.equals("Scissors"))
			{
				System.out.println(playerResponse+" vs. "+computerResponse);
				System.out.println("The computer wins this round!");
				computerWins++;
			}
			else if(playerResponse.equalsIgnoreCase("Scissors") && computerResponse.equals("Rock"))
			{
				System.out.println(playerResponse+" vs. "+computerResponse);
				System.out.println("The computer wins this round!");
				computerWins++;
			}
			else if(playerResponse.equalsIgnoreCase("Paper") && computerResponse.equals("Rock"))
			{
				System.out.println(playerResponse+" vs. "+computerResponse);
				System.out.println("You win this round!");
				playerWins++;
			}
			else if(playerResponse.equalsIgnoreCase("Scissors") && computerResponse.equals("Paper"))
			{
				System.out.println(playerResponse+" vs. "+computerResponse);
				System.out.println("You win this round!");
				playerWins++;
			}
			else if(playerResponse.equalsIgnoreCase("Rock") && computerResponse.equals("Scissors"))
			{
				System.out.println(playerResponse+" vs. "+computerResponse);
				System.out.println("You win this round!");
				playerWins++;
			}
			else if(playerResponse.equalsIgnoreCase(computerResponse))
			{
				System.out.println(playerResponse+" vs. "+computerResponse);
				System.out.println("You and the computer tied this round! No points have been awarded.");
			}
			System.out.println("You have won "+playerWins+" times and the computer has won "+computerWins+" times.");
			if(rounds==3)
			{
				if(playerWins > computerWins)
				{
					System.out.println("You win the game!");
				}
				else if(playerWins < computerWins)
				{
					System.out.println("The computer wins the game!");
				}
				else if(playerWins == computerWins)
				{
					System.out.println("You and the computer tied the game!");
				}
				System.out.println("Would you like to play again? Enter \"yes\" or \"no\".");
				String playAgain = keyboard.nextLine();
				if(playAgain.equalsIgnoreCase("Yes"))
				{
					System.out.println("You will play again!\n");
					rounds = 0;
					playerWins = 0;
					computerWins = 0;
					continue;
				}
				else if(playAgain.equalsIgnoreCase("No"))
				{
					System.out.println("Thank you for playing!");
					System.exit(0);
				}
				else
				{
					System.out.println("Sorry that is not a valid answer. The game will end.");
					System.exit(0);
				}
			}
		}
		

	}

}
