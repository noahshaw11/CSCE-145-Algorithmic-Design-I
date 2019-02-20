/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class Lab08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prompt the user to input a phrase and a letter
		System.out.println("Welcome to the Letter Counter!"
				+ "\nFirst enter a phrase and press ENTER. Then, enter a letter to be counted and press ENTER.");
		Scanner keyboard = new Scanner(System.in);
		String phrase = keyboard.nextLine();
		System.out.println(phrase+" is an interesting phrase.");
		char letter = keyboard.next().charAt(0);
		char letterCopy = letter;
		int amount = 0;
		//Analyze every letter at every index in the phrase
		for(int i=0; (i <= (phrase.length()-1)); i++)
		{
			char c = phrase.charAt(i);
			c = Character.toLowerCase(c);
			letterCopy = Character.toLowerCase(letter);
			//Decide whether or not the letter at the index is the same as the user's inputted letter
			if(c == letterCopy)
			{
				amount++;
			}
		}
		//Display the results
		System.out.println("The letter \""+letter+"\" occurs "+amount+" times in the phrase \""+phrase+"\".");

	}

}
