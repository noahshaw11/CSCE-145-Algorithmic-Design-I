/*
 * Created by Noah Shaw
 */
public class Dresser {
	//Instance variables
	private Clothing[][] clothes;
	public static final int numOfDrawers = 5;
	public static final int numOfClothes = 10;
	//Constructors
	public Dresser()
	{
		clothes = new Clothing[numOfDrawers][numOfClothes];
	}
	//No accessors/mutators
	//Methods
	public void addClothing(Clothing aClothing) //0-Undergarment 1-Socks or Stockings 2-Top 3-Bottom 4-Cape
	{
		//Clothing is a undergarment
		if(aClothing.getType().equalsIgnoreCase("Undergarment"))
		{
			//If the drawer is full, state it
			if(clothes[0][numOfClothes - 1] != null) //Array is full
			{
				System.out.println("Sorry that drawer is full.");
				return;
			}
			//Else place the clothing in the drawer
			else
			{
				for(int i = 0; i < numOfClothes; i++) //Found an empty space
				{
					if(clothes[0][i] == null)
					{
						clothes[0][i] = aClothing;
						break;
					}
				}
			}
		}
		//Clothing is socks or stockings
		else if(aClothing.getType().equalsIgnoreCase("Socks") || aClothing.getType().equalsIgnoreCase("Stockings"))
		{
			//If the drawer is full, state it
			if(clothes[1][numOfClothes-1] != null) //Array is full
			{
				System.out.println("Sorry that drawer is full.");
				return;
			}
			//Else place the clothing in the drawer
			else
			{
				for(int i = 0; i < numOfClothes; i++) //Found an empty space
				{
					if(clothes[1][i] == null)
					{
						clothes[1][i] = aClothing;
						break;
					}
				}
			}
		}
		//Clothing is a top
		else if(aClothing.getType().equalsIgnoreCase("Top"))
		{
			//If the drawer is full, state it
			if(clothes[2][numOfClothes-1] != null) //Array is full
			{
				System.out.println("Sorry that drawer is full.");
				return;
			}
			//Else place the clothing in the drawer
			else
			{
				for(int i = 0; i < numOfClothes; i++) //Found an empty space
				{
					if(clothes[2][i] == null)
					{
						clothes[2][i] = aClothing;
						break;
					}
				}
			}
		}
		//Clothing is a bottom
		else if(aClothing.getType().equalsIgnoreCase("Bottom"))
		{
			//If the drawer is full, state it
			if(clothes[3][numOfClothes-1] != null) //Array is full
			{
				System.out.println("Sorry that drawer is full.");
				return;
			}
			//Else place the clothing in the drawer
			else
			{
				for(int i = 0; i < numOfClothes; i++) //Found an empty space
				{
					if(clothes[3][i] == null)
					{
						clothes[3][i] = aClothing;
						break;
					}
				}
			}
		}
		//Clothing is a cape
		else if(aClothing.getType().equalsIgnoreCase("Cape"))
		{
			//If the drawer is full, state it
			if(clothes[4][numOfClothes-1] != null) //Array is full
			{
				System.out.println("\nSorry that drawer is full.");
				return;
			}
			//Else place the clothing in the drawer
			else
			{
				for(int i = 0; i < numOfClothes; i++) //Found an empty space
				{
					if(clothes[4][i] == null)
					{
						clothes[4][i] = aClothing;
						break;
					}
				}
			}
		}
	}
	public void removeClothing(Clothing aClothing)
	{
		int rmIndex = -1; //Sentinel value
		int rmIndex2 = -1;
		for(int i = 0; i < numOfDrawers; i++) //Find the index of the item to remove
		{
			for(int j = 0; j < numOfClothes; j++)
			{
				if(clothes[i][j] != null && clothes[i][j].equals(aClothing))
				{
					rmIndex = i;
					rmIndex2 = j;
					break;
				}
			}
		}
		if(rmIndex == -1 && rmIndex2 == -1) //Item was not found
		{
			return;
		}
		for(int i = rmIndex; i < numOfDrawers; i++) //Shift all items forward
		{
			for(int j = rmIndex2; j < numOfClothes - 1; j++)
			{
				clothes[i][j] = clothes[i][j + 1];
			}
		}
		clothes[numOfDrawers - 1][numOfClothes - 1] = null; //Set the last item to null
	}
	public void print()
	{
		for(int i = 0; i < numOfDrawers; i++)
		{
			System.out.println("\nDrawer: "+ (i+1)); //Print the drawer
			for(int j = 0; j < numOfClothes; j++)
			{
				if(clothes[i][j] == null) //Don't print the null items
				{
					break;
				}
				else
				{
					System.out.println(clothes[i][j]); //Print each item
				}
			}
		}
	}

}
