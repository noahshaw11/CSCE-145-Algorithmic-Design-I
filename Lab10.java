/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prompt the user
		System.out.println("Welcome to the Matrix Adder!\n");
		//Ask the user to input the lengths and heights of the matrices
		System.out.println("Please enter the length of the first matrix.");
		Scanner keyboard = new Scanner (System.in);
		int firstLength = keyboard.nextInt();
		System.out.println("Please enter the height of the first matrix.");
		int firstHeight = keyboard.nextInt();
		System.out.println("Please enter the length of the second matrix.");
		int secondLength = keyboard.nextInt();
		System.out.println("Please enter the height of the second matrix.");
		int secondHeight = keyboard.nextInt();
		System.out.println("");
		//Determine if the matrices have the same dimensions
		if((firstLength != firstHeight) || (firstLength != secondLength) || (firstLength != secondHeight) || (firstHeight != firstLength) || (firstHeight != secondLength) || (firstHeight != secondHeight))
		{
			System.out.println("Cannot add these! Dimension mismatch!");
		}
		else
		{
			//Construct the first and second matrices
			int [][] first = new int [firstLength][firstHeight];
			int [][] second = new int [secondLength][secondHeight];
			//Fill the first matrix
			for(int i = 0; i < first.length; i++)
			{
				for(int j = 0; j < first.length; j++)
				{
					System.out.println("Please enter a value for matrix 1 space "+(i+1)+", "+(j+1)+".");
					first[i][j] = keyboard.nextInt();
				}
			}
			System.out.println(" ");
			//Fill the second matrix
			for(int i = 0; i < second.length; i++)
			{
				for(int j = 0; j < second.length; j++)
				{
					System.out.println("Please enter a value for matrix 2 space "+(i+1)+", "+(j+1)+".");
					second[i][j] = keyboard.nextInt();
				}
			}
			System.out.println("");
			//Print the values of the first array
			for(int i = 0; i < first.length; i++)
			{
				for(int j = 0; j < first.length; j++)
				{
					System.out.print(first[i][j]+" ");	
				}
				System.out.println(" ");
			}
			System.out.println("+");
			//Print the values of the second array
			for(int i = 0; i < second.length; i++)
			{
				for(int j = 0; j < second.length; j++)
				{
					System.out.print(second[i][j]+" ");	
				}
				System.out.println(" ");
			}
			System.out.println("=");
			//Construct the result array
			int [][] result = new int [firstLength][firstHeight];
			//Fill the array and display the result of the matrix addition
			for(int i = 0; i < second.length; i++)
			{
				for(int j = 0; j < second.length; j++)
				{
					int firstValue = first[i][j];
					int secondValue = second[i][j];
					int resultValue = firstValue + secondValue;
					result[i][j] = resultValue;
					System.out.print(resultValue+" ");
				}
				System.out.println("");
			}
			//End the program
			System.out.println("DONE!");
		}

	}

}
