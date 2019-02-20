import java.util.Scanner;
public class CrazyCatPersonHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		/* Need user input
		String catName01 = "Mr. Flufferkins";
		double catWeight01 = 10.0;
		int catNumLegs = 4;
		*/
		/*
		System.out.println("Enter the cat's name, weight, and number of legs.");
		String catName01 = keyboard.nextLine();
		double catWeight01 = keyboard.nextDouble();
		int catNumLegs01 = keyboard.nextInt();
		
		System.out.println("Enter the cat's ...");
		String catName02 = keyboard.nextLine();
		double catWeight02 = keyboard.nextDouble();
		int catNumLegs02 = keyboard.nextInt();
		*/
		/*
		int catNum = keyboard.nextInt();
		if(catNum <= 0)
		{
			System.exit(0);
		}
		String[] catNames = new String[catNum];
		double[] catWeights = new double[catNum];
		int[] catNumLegs = new int[catNum];
		for(int i = 0; i<catNum; i++)
		{
			System.out.println("Enter the stuff.");
			catNames[i] = keyboard.nextLine();
			catWeights[i] = keyboard.nextDouble();
			catNumLegs[i] = keyboard.nextInt();
		}
		*/
		/*
		Cat cat01 = new Cat(); //Constructor call
		System.out.println(cat01.getName()+" "+cat01.getWeight());
		cat01.setName("Mr. Flufferkins");
		cat01.setWeight(10.0);
		cat01.setNumLegs(4);
		*/
		/*Cat cat01 = new Cat("Mr. Flufferkins", 10.0, 4);
		System.out.println(cat01);
		*/
		Cat[] cats = new Cat[3];
		for(int i = 0; i<cats.length; i++)
		{
			cats[i] = new Cat(keyboard.nextLine(), keyboard.nextDouble(), keyboard.nextInt());
		}
	}

}
