/*
 * Created by Noah Shaw
 */
public class AnimalCollection {
	
	//Attributes
	private Animal[] animals;
	public static final int numOfAnimals = 10;
	
	//Constructors
	public AnimalCollection() //Default
	{
		animals = new Animal[numOfAnimals];
	}
	
	//Methods
	public void addAnimal(Animal aAnimal)
	{
		if(animals[animals.length - 1] != null)
		{
			System.out.println("Sorry the collection is full.");
			return;
		}
		else
		{
			for(int i = 0; i < animals.length; i++)
			{
				if(animals[i] == null)
				{
					animals[i] = aAnimal;
					break;
				}
			}
		}
	}
	public void removeAnimal(Animal aAnimal)
	{
		int rmIndex = -1; //Sentinel value
		for(int i = 0; i < animals.length; i++)
		{
			if(animals[i] != null && animals[i].getName().equalsIgnoreCase(aAnimal.getName()))
			{
				rmIndex = i;
				break;
			}
		}
		if(rmIndex == -1)
		{
			return;
		}
		for(int i = rmIndex; i < animals.length - 1; i++)
		{
			animals[i] = animals[i+1];
		}
		animals[animals.length - 1] = null;
	}
	public void printAnimals()
	{
		System.out.println();
		System.out.println("CURRENT COLLECTION");
		for(int i = 0; i < animals.length; i++)
		{
			if(animals[i] == null)
			{
				break;
			}
			System.out.println(animals[i]);
		}
	}

}
