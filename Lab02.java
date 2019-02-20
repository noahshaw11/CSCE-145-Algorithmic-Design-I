/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class Lab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the Convertinator ready for work.");
		System.out.println("Please enter a weight in pounds.");
		Scanner poundsKeyboard = new Scanner(System.in);
		double pounds = poundsKeyboard.nextDouble();
		System.out.println("Please enter a height in feet.");
		Scanner heightKeyboard = new Scanner(System.in);
		double height = heightKeyboard.nextDouble();
		double kilograms = (pounds*.456);
		double stones = (pounds*.071);
		double slugs = (pounds*.031);
		double pennyweights = (pounds*291.667);
		double grains = (pounds*7000);
		System.out.println(pounds+" pounds"+" is "+kilograms+" kilograms.");
		System.out.println(pounds+" pounds"+" is "+stones+" stones.");
		System.out.println(pounds+" pounds"+" is "+slugs+" slugs.");
		System.out.println(pounds+" pounds"+" is "+pennyweights+" pennyweights.");
		System.out.println(pounds+" pounds"+" is "+grains+" grains.");
		double meters = (height*.305);
		double hands = (height*3);
		double furlongs = (height*.002);
		double cubits = (height*.667);
		double rackUnits = (height*6.857);
		System.out.println(height+" feet"+" is "+meters+" meters.");
		System.out.println(height+" feet"+" is "+hands+" hands.");
		System.out.println(height+" feet"+" is "+furlongs+" furlongs.");
		System.out.println(height+" feet"+" is "+cubits+" cubits.");
		System.out.println(height+" feet"+" is "+rackUnits+" rack units.");
		System.out.println("Thank you for choosing the Convertinator for all of your converting needs.");

	}

}
