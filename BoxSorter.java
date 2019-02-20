/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class BoxSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Greet the user
		System.out.println("Welcome to the box sorter!"
				+ "\nEnter the information about boxes and I will sort them!");
		//Construct the array
		Box[] boxes = new Box[5];
		//Prompt the user to input the values for each box
		for(int i = 0; i < boxes.length; i++)
		{
			System.out.println("Enter the label, length, width, and height (all in feet) of box " + (i+1) + ".");
			Scanner keyboard = new Scanner(System.in);
			String label = keyboard.nextLine();
			double length = keyboard.nextDouble();
			double width = keyboard.nextDouble();
			double height = keyboard.nextDouble();
			boxes[i] = new Box(label, length, width, height);
		}
		//Sort the boxes using bubble sort
		System.out.println("Sorting boxes.");
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i = 0; i < boxes.length - 1; i++)
			{
				if(boxes[i].getVolume() > boxes[i+1].getVolume())
				{
					//Swap
					Box temp = boxes[i];
					boxes[i] = boxes[i+1];
					boxes[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
		//Print the boxes in order from least to greatest volume
		for(int i = 0; i < boxes.length; i++)
		{
			System.out.println(boxes[i].toString());
		}

	}

}
