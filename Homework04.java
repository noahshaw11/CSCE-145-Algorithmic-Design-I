/*
 * Created by Noah Shaw
 */
import java.util.Scanner;
import java.util.Random;
public class Homework04 {

	public static final int BoardSize = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prompt the user
		System.out.println("Welcome to the Mine Walker! Get to the ice cream and avoid the mines!");
		Scanner keyboard = new Scanner (System.in);
		//Initialize the movement variables
		int movementX = 0;
		int movementY = 0;
		int x = 0;
		int y = 0;
		//Initialize the mine variables
		int minesX = 0;
		int minesY = 0;
		//Define the location of the ice cream
		Random rand = new Random();
		int icecreamX = rand.nextInt(BoardSize);
		int icecreamY = rand.nextInt(BoardSize);
		//Construct the board
		String[][] space = new String[BoardSize][BoardSize];
		//Define the amount of mines
		int amountOfMines = (BoardSize*BoardSize)/10;
		//Place the mines on the board
		for(int i = 0; i < amountOfMines; i++)
		{
			minesX = rand.nextInt(BoardSize);
			minesY = rand.nextInt(BoardSize);
			if(space[minesX][minesY] != null)
			{
				while(space[minesX][minesY] != null)
				{
					minesX = rand.nextInt(BoardSize);
					minesY = rand.nextInt(BoardSize);
				}
			}
			space[minesX][minesY] = "-5";
		}
		boolean gameOver = false;
		//Game loop
		while(!gameOver)
		{
			//Prompt the user to input their x direction movement
			//Draw the new board
			for(int i = 0; i < space.length; i++)
			{
				for(int j = 0; j < space.length; j++)
				{
					if(j == x && i == y)
					{
						System.out.print("X");
					}
					else if(j == icecreamX && i == icecreamY)
					{
						System.out.print("^");
					}
					else
					{
						System.out.print("_");
					}
				}
				System.out.println("");
			}
			//Prompt the user to input their x direction movement
			System.out.println("Enter either a -1, 0, or 1 to move in the x direction or 9 to quit.");
			movementX = keyboard.nextInt();
			if(movementX == 9)
			{
				System.out.println("Thanks for playing!");
				System.exit(0);
			}
			else if(movementX == -1)
			{
				x = x - 1;
			}
			else if(movementX == 1)
			{
				x = x + 1;
			}
			else if(movementX == 0)
			{
				x = x + 0;
			}
			else if(movementX > 9)
			{
				System.out.println("Invalid input. Not moving in the x direction.");
				x = x + 0;
			}
			else if(movementX > 1)
			{
				System.out.println("Invalid input. Not moving in the x direction.");
				x = x + 0;
			}
			else if(movementX < -1)
			{
				System.out.println("Invalid input. Not moving in the x direction.");
				x = x + 0;
			}
			//Prompt the user to input their y direction movement
			System.out.println("Enter either a -1, 0, or 1 to move in the y direction or 9 to quit.");
			movementY = keyboard.nextInt();
			if(movementY == 9)
			{
				System.out.println("Thank you for playing!");
				System.exit(0);
			}
			else if(movementY == -1)
			{
				y = y - 1;
			}
			else if(movementY == 1)
			{
				y = y + 1;
			}
			else if(movementY == 0)
			{
				y = y + 0;
			}
			else if(movementY > 9)
			{
				System.out.println("Invalid input. Not moving in the y direction.");
				y = y + 0;
			}
			else if(movementY > 1)
			{
				System.out.println("Invalid input. Not moving in the y direction.");
				y = y + 0;
			}
			else if(movementY < -1)
			{
				System.out.println("Invalid input. Not moving in the y direction.");
				y = y + 0;
			}
			//Check to see if the user's position is where a mine is
			if(space[x][y] == "-5")
			{
				System.out.println("Boom! You hit a mine!");
				//Determine if the player wants to play again
				System.out.println("Would you like to play again? Yes or no?");
				String playAgain = keyboard.nextLine(); //Capture extra space
				playAgain = keyboard.nextLine();
				//Play again = true, reset game
				if(playAgain.equalsIgnoreCase("yes"))
				{
					System.out.println("Good luck!");
					space = new String[BoardSize][BoardSize];
					movementX = 0;
					movementY = 0;
					x = 0;
					y = 0;
					icecreamX = rand.nextInt(BoardSize);
					icecreamY = rand.nextInt(BoardSize);
					for(int i = 0; i < amountOfMines; i++)
					{
						minesX = rand.nextInt(BoardSize);
						minesY = rand.nextInt(BoardSize);
						if(space[minesX][minesY] != null)
						{
							while(space[minesX][minesY] != null)
							{
								minesX = rand.nextInt(BoardSize);
								minesY = rand.nextInt(BoardSize);
							}
						}
						space[minesX][minesY] = "-5";
					}
				}
				//Else end the game
				else if(playAgain.equalsIgnoreCase("no"))
				{
					System.out.println("Thanks for playing!");
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid response. You will not play again.");
					System.exit(0);
				}
			}
			//Check to see if the user's position is where the ice cream is
			else if(x == icecreamX && y == icecreamY)
			{
				System.out.println("You got the icecream!");
				//Determine if the player wants to play again
				System.out.println("Would you like to play again? Yes or no?");
				String playAgain = keyboard.nextLine(); //Capture extra space
				playAgain = keyboard.nextLine();
				//Play again = true, reset game
				if(playAgain.equalsIgnoreCase("yes"))
				{
					System.out.println("Good luck!");
					space = new String[BoardSize][BoardSize];
					movementX = 0;
					movementY = 0;
					x = 0;
					y = 0;
					icecreamX = rand.nextInt(BoardSize);
					icecreamY = rand.nextInt(BoardSize);
					for(int i = 0; i < amountOfMines; i++)
					{
						minesX = rand.nextInt(BoardSize);
						minesY = rand.nextInt(BoardSize);
						if(space[minesX][minesY] != null)
						{
							while(space[minesX][minesY] != null)
							{
								minesX = rand.nextInt(BoardSize);
								minesY = rand.nextInt(BoardSize);
							}
						}
						space[minesX][minesY] = "-5";
					}
				}
				//Else end the game
				else if(playAgain.equalsIgnoreCase("no"))
				{
					System.out.println("Thanks for playing!");
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid response. You will not play again.");
					System.exit(0);
				}
			}
		}
		
	}

}
