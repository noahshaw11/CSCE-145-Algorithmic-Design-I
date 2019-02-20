/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class LabExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the bouncing ball program!");
		System.out.println("");
		System.out.println("Please enter the initial velocity.");
		Scanner keyboard = new Scanner(System.in);
		double initialVelocity = keyboard.nextDouble();
		int time = 0;
		double height = 0;
		int bounces = 0;
		System.out.println("Time: "+time+" Height: "+height);
		while(height>=0)
		{
			time++;
			height = height + initialVelocity;
			initialVelocity = initialVelocity - 32;
			if(height<0)
			{
				height = height * (-0.5);
				initialVelocity = initialVelocity * (-0.5);
				System.out.println("BOUNCE!");
				bounces++;
				if(bounces==5)
				{
					System.exit(0);
				}
			}
			System.out.println("Time: "+time+" Height: "+height);
		}

	}

}
