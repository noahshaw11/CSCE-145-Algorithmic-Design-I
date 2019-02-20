/*
 * Created by Noah Shaw
 */
public class Grade {
	
	//Instance variables
	private String name;
	private int score;
	
	//Constructors
	public Grade()
	{
		this.name = "lab";
		this.score = 100;
	}
	public Grade(String aName, int aScore)
	{
		this.setName(aName);
		this.setScore(aScore);
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public int getScore()
	{
		return this.score;
	}
	
	//Mutators
	public void setName(String aName)
	{
		if(aName.equalsIgnoreCase("labs") || aName.equalsIgnoreCase("lab reports") || aName.equalsIgnoreCase("homework") || aName.equalsIgnoreCase("exam 1") || aName.equalsIgnoreCase("exam 2") || aName.equalsIgnoreCase("lab exam 1") || aName.equalsIgnoreCase("lab exam 2") || aName.equalsIgnoreCase("final") || aName.equalsIgnoreCase("extra credit"))
		{
			this.name = aName;
		}
		else
		{
			System.out.println("Invalid assignment");
		}
	}
	public void setScore(int aScore)
	{
		if(aScore >= 0 && aScore <= 100)
		{
			this.score = aScore;
		}
		else
		{
			System.out.println("Invalid score");
		}
	}

}
