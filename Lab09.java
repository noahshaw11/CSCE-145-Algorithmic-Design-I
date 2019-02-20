/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class Lab09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prompt the user
		System.out.println("Welcome to the Above Average Temperature Calculator!\n");
		Scanner keyboard = new Scanner(System.in);
		//Construct the array
		double[] temp = new double[10];
		//Fill in the array
		for(int i = 0; i <= temp.length-1; i++)
		{
			System.out.println("Please enter the temperature for day "+(i+1)+".");
			temp[i] = keyboard.nextDouble();
		}
		//Calculate the average temperature
		double average = 0;
		for(int i = 0; i <= temp.length-1; i++)
		{
			average = average + temp[i];
		}
		average = average/10;
		System.out.println("\nThe average temperature was "+average+".");
		System.out.println("The days that were above the average temperature were:");
		//Find which days had a temperature that was above average
		for(int i = 0; i <= temp.length-1; i++)
		{
			if(temp[i]>average)
			{
				System.out.println("Day "+(i+1)+" with a temperature of "+temp[i]);
			}
		}

	}

}
