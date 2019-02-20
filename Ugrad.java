
public class Ugrad extends Student {
	private int level; //1-Fresh 2-Soph 3-Junior 4-Senior 5-SSGSS
	public Ugrad()
	{
		super(); //Calls the student's default constructor
		this.level = 1;
	}
	public Ugrad(String aName, int aID, int aLevel)
	{
		super(aName, aID);
		//TODO Call mutator
		this.setLevel(aLevel);
	}
	public int getLevel()
	{
		return this.level;
	}
	public void setLevel(int aLevel)
	{
		if(aLevel >= 1 && aLevel <=5)
		{
			this.level = aLevel;
		}
	}
	public String toString()
	{
		return super.toString()+" Level: "+this.getLevel();
	}
	public boolean equals(Ugrad aUgrad)
	{
		return aUgrad != null &&
				super.equals(aUgrad) &&
				this.level == aUgrad.getLevel();
	}

}
