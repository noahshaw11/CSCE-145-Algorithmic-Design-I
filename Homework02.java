/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Land of Unhappy Endings! Will you slay the Mighty Bringer of Unhappy Endings, play Blackjack against the Captain of the The Dread Pearl, or "
				+ "\ntwiddle your thumbs in a corner to start your quest for your unhappy ending? Type \"slay\", \"blackjack\", or \"twiddle\".");
		Scanner keyboard = new Scanner(System.in);
		String decisionOne = keyboard.nextLine();
		//Slay
		if(decisionOne.equalsIgnoreCase("slay"))
		{
			System.out.println("You have chosen to slay the the Mighty Bringer of Unhappy Endings! ");
			System.out.println("The Mighty Bringer melds into the shadows. Will you cast your flare or patiently wait for his surprise attack? Enter \"flare\" or \"wait\".");
			String slayDecisionOne = keyboard.nextLine();
			//Flare
			if(slayDecisionOne.equalsIgnoreCase("flare"))
			{
				System.out.println("Ha! The Mighty Bringer thought you would cast your flare! Hundreds of orc warriors are swarming your location! Will you run for your life or drink your \nPotion of Worst Possible Endings? Enter \"run\" or \"potion\".");
				String slayDecisionTwo = keyboard.nextLine();
				//Run (possible ending #1)
				if(slayDecisionTwo.equalsIgnoreCase("run"))
				{
					System.out.println("You have run away from your unhappy ending! You will never have your unhappy ending!");
				}
				//Potion (possible ending #2)
				else if(slayDecisionTwo.equalsIgnoreCase("potion"))
				{
					System.out.println("As the potion rushes down your throat, and the orcs swarm your location, you remember who the real enemy is just as he stabs you in the back. This is your \nunhappy ending!");
				}
			}
			//Wait
			else if(slayDecisionOne.equalsIgnoreCase("wait"))
			{
				System.out.println("You waiting for his surprise attack caused the Mighty Bringer's plan to fail. He did not expect you to wait, and he stayed in the shadows too long. The "
						+ "\nShadowmaster ate him. Will you fight the Shadowmaster or call for peace. Enter \"fight\" or \"peace\"");
				String slayDecisionThree = keyboard.nextLine();
				//Fight (possible ending #3)
				if(slayDecisionThree.equalsIgnoreCase("fight"))
				{
					System.out.println("You fight the Shadowmaster and dodge all of his shadowbolts. However, when he casts \"Unhappy Endings\" you will realize that this is your destiny. You take "
							+ "\nthe unhappy ending to the face!");
				}
				//Peace (possible ending #4)
				else if(slayDecisionThree.equalsIgnoreCase("peace"))
				{
					System.out.println("The Shadowmaster agrees to your terms of peace. You will not have your unhappy ending by the hands of the Shadowmaster.");
				}
			}
		}
		//Blackjack
		else if(decisionOne.equalsIgnoreCase("blackjack"))
		{
			System.out.println("You have chosen to play Blackjack against the the one who never loses, the Captain of the Dread Pearl!");
			System.out.println("The Captain draws a two and four. You draw a king and a three! You beat the one who never loses! Would you like to play again? Enter \"yes\" or \"no\".");
			String blackjackDecisionOne = keyboard.nextLine();
			//Yes (possible ending #5)
			if(blackjackDecisionOne.equalsIgnoreCase("yes"))
			{
				System.out.println("The Captain draws a 9 and a 4. You draw a 2 and a 1. Game over. You lose.");
			}
			//No
			else if(blackjackDecisionOne.equalsIgnoreCase("no"))
			{
				System.out.println("You notice a suspicious woman standing in the corner of the Captain's ship. You approach her, and she says she has the key to your unhappy ending for a "
						+ "\nprice. Enter a whole number between 1 and 5 if you are willing to pay for it. If not enter \"0\".");
				int blackjackDecisionTwo = keyboard.nextInt();
				//==4 (possible ending #6)
				if(blackjackDecisionTwo==4)
				{
					System.out.println("You guessed the right price! You owe the Captain's wife four shards of your soul. You are now a lifeless being. This is your unhappy ending.");
				}
				//==0 (possible ending #7)
				else if(blackjackDecisionTwo==0)
				{
					System.out.println("No happy ending for you.");
				}
				//<=4 (possible ending #8)
				else if(blackjackDecisionTwo<=4)
				{
					System.out.println("You guessed too low. You will never find your unhappy ending. Get out of my face.");
				}
				//>=4 (possible ending #9)
				else if(blackjackDecisionTwo>=4)
				{
					System.out.println("You guessed too high, but the Captain's wife is a greedy one. She takes "+blackjackDecisionTwo+" shards of your soul, and you fade away. This is your unhappy ending.");
				}
			}
		}
		//Twiddle
		else if(decisionOne.equalsIgnoreCase("twiddle"))
		{
			System.out.println("Sadly, you have chosen to twiddle your thumbs in a corner. However, something unexpected happens. A strange kid appears in front of you and begins to "
					+ "\ntwiddle his thumbs. You do not like how he is copying you. Which fingers will you twiddle now? Enter \"index\", \"pinky\", \"ring\", or \"middle\".");
			String twiddleDecisionOne = keyboard.nextLine();
			//Index and pinky
			if((twiddleDecisionOne.equalsIgnoreCase("index"))||(twiddleDecisionOne.equalsIgnoreCase("pinky")))
			{
				System.out.println("The kid closely watches you twiddle your "+twiddleDecisionOne+" finger. He is curious how you are doing it. Will you teach him or walk away? Enter \"teach\" or \"walk\".");
				String twiddleDecisionTwo = keyboard.nextLine();
				//Teach (possible ending #10)
				if(twiddleDecisionTwo.equalsIgnoreCase("teach"))
				{
					System.out.println("Why did you choose to teach the kid? It has been 2,345 years, and he still hasn't learned! What an unhappy ending that is...");
				}
				//Walk (possible ending #11)
				else if(twiddleDecisionTwo.equalsIgnoreCase("walk"))
				{
					System.out.println("You would have been stuck teaching that kid for a while. Be happy you got away, but you will not be experiencing your unhappy ending.");
				}
			}
			//Ring and middle (possible ending #12)
			else if((twiddleDecisionOne.equalsIgnoreCase("ring"))||(twiddleDecisionOne.equalsIgnoreCase("middle")))
			{
				System.out.println("The kid's parents approach the two of you. They yell, \"What did we say about talking to strangers!?!\" at the boy. The boy runs away, and the father turns "
						+ "\ninto a dragon. You catch a glimpse of him just as he incinerates you. What an unhappy ending...");
			}
		}

	}

}
