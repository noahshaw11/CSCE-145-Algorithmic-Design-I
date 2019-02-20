/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class Lab07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prompt the user to input the size of the triangle
		System.out.println("Welcome to the Triangle Maker 9000! Enter the size of the triangle.");
		Scanner keyboard = new Scanner(System.in);
		int size = keyboard.nextInt();
		//Determine if the user's input is valid
		if(size <= 0)
		{
			System.out.println("Sorry, that is not a valid input.");
			System.exit(0);
		}
		//Draw the triangle
		for(int i = 1; i <= size; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k = (size-1); k >= 1; k--)
		{
			for(int l = 1; l <= k; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Done!");

	}

}
