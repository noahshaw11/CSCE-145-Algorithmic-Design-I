/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class Lab05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prompt the user to enter their birth year
		System.out.println("Please enter your birth year to determine your Chinese zodiac.");
		Scanner keyboard = new Scanner(System.in);
		int birthYear = keyboard.nextInt();
		//End the program if the user's birth year is not greater than or equal to 1924
		if(birthYear<1924)
		{
			System.out.println("Sorry, your birth year is not 1924 or after.");
			System.exit(0);
		}
		//Determine the user's animal sign
		birthYear = birthYear-1924;
		birthYear = birthYear%12;
		String animal = null;
		if(birthYear==0)
		{
			animal = "Rat";
		}
		else if(birthYear==1)
		{
			animal = "Ox";
		}
		else if(birthYear==2)
		{
			animal = "Tiger";
		}
		else if(birthYear==3)
		{
			animal = "Rabbit";
		}
		else if(birthYear==4)
		{
			animal = "Dragon";
		}
		else if(birthYear==5)
		{
			animal = "Snake";
		}
		else if(birthYear==6)
		{
			animal = "Horse";
		}
		else if(birthYear==7)
		{
			animal = "Goat";
		}
		else if(birthYear==8)
		{
			animal = "Monkey";
		}
		else if(birthYear==9)
		{
			animal = "Rooster";
		}
		else if(birthYear==10)
		{
			animal = "Dog";
		}
		else if(birthYear==11)
		{
			animal = "Pig";
		}
		//Determine the user's element sign
		String element = null;
		if((animal=="Tiger") || (animal=="Rabbit"))
		{
			element = "Wood";
		}
		else if((animal=="Snake") || (animal=="Horse"))
		{
			element = "Fire";
		}
		else if((animal=="Ox") || (animal=="Dragon") || (animal=="Goat") || (animal=="Dog"))
		{
			element = "Earth";
		}
		else if((animal=="Monkey") || (animal=="Rooster"))
		{
			element = "Metal";
		}
		else if((animal=="Pig") || (animal=="Rat"))
		{
			element = "Water";
		}
		//Display the user's Chinese zodiac
		System.out.println("You are a "+element+" "+animal+".");
	}

}
