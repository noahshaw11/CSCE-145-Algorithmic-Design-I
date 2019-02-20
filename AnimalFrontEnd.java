/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
public class AnimalFrontEnd {
	
	public static AnimalCollection animalCollection;
	public static Scanner keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Cat and Dog Collection!");
		animalCollection = new AnimalCollection();
		boolean done = false;
		while(done != true)
		{
			System.out.println("Would you like to:"
					+ "\n1. Add a cat or dog"
					+ "\n2. Remove a cat or dog"
					+ "\n3. Quit");
			keyboard = new Scanner(System.in);
			int option = keyboard.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Would you like to add a (1) House Cat, (2) Leopard, (3) Domestic Dog, (4) Wolf?");
				int answer = keyboard.nextInt();
				keyboard.nextLine();
				switch(answer)
				{
				case 1:
					System.out.println("Enter the house cat's name, weight, mood, and type.");
					String name = keyboard.nextLine();
					double weight = keyboard.nextDouble();
					keyboard.nextLine();
					String mood = keyboard.nextLine();
					String type = keyboard.nextLine();
					animalCollection.addAnimal(new HouseCat(name, weight, mood, type));
					break;
				case 2:
					System.out.println("Enter the leopard's name, weight, mood, and number of spots.");
					name = keyboard.nextLine();
					weight = keyboard.nextDouble();
					mood = keyboard.nextLine();
					keyboard.nextLine();
					int numberOfSpots = keyboard.nextInt();
					animalCollection.addAnimal(new Leopard(name, weight, mood, numberOfSpots));
					break;
				case 3:
					System.out.println("Enter the domestic dog's name, weight, energy level, and type.");
					name = keyboard.nextLine();
					weight = keyboard.nextDouble();
					int energyLevel = keyboard.nextInt();
					keyboard.nextLine();
					type = keyboard.nextLine();
					animalCollection.addAnimal(new DomesticDog(name, weight, energyLevel, type));
					break;
				case 4:
					System.out.println("Enter the wolf's name, weight, energy level, and pack leaders name.");
					name = keyboard.nextLine();
					weight = keyboard.nextDouble();
					energyLevel = keyboard.nextInt();
					keyboard.nextLine();
					String packLeaderName = keyboard.nextLine();
					animalCollection.addAnimal(new Wolf(name, weight, energyLevel, packLeaderName));
					break;
				default:
					System.out.println("Invalid");
				}
				break;
			case 2:
				System.out.println("Enter the animal's name that is to be removed.");
				keyboard.nextLine();
				String name = keyboard.nextLine();
				animalCollection.removeAnimal(new Animal(name, 0));
				break;
			case 3:
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid");
			}
			animalCollection.printAnimals();
		}

	}

}
