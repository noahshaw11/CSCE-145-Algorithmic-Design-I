/*
 * Created by Noah Shaw
 */
public class Diamond extends ShapeBasics implements DiamondInterface {
	//Attributes
	private int width;
	//Constructors
	public Diamond()
	{
		super();
		this.width = 0;
	}
	public Diamond(int aWidth, int newOffset)
	{
		super(newOffset);
		this.setWidth(aWidth);
	}
	//Accessors
	public int getWidth()
	{
		return this.width;
	}
	//Mutators
	public void setWidth(int width)
	{
		if(width%2 == 1)
		{
			this.width = width;
		}
		else
		{
			this.width = width + 1;
		}
	}
	//Methods
	public void drawHere() //Override
	{
		drawTopV();
		drawBottomV();
	}
	private void drawTopV()
	{
		for(int i = 0; i < ((this.width + 1) / 2); i++)
		{
			for(int j = 0; j <= ((this.width - 1) + this.getOffset()); j++)
			{
				if(j == ((this.width - 1) / 2) + this.getOffset() + i || j == (((this.width - 1) / 2) + this.getOffset() - i))
				{
					System.out.print("*");
				}
				else
				{
					skipSpaces(1);
				}
			}
			System.out.println();
		}
	}
	private void drawBottomV()
	{
        for (int i = (((this.width - 1) / 2) - 1); i >= 0; i--)
        {
            for(int j = 0; j <= ((this.width -1 ) + this.getOffset()); j++)
            {
            	if(j == ((this.width - 1) / 2) + this.getOffset() + i || j == (((this.width - 1) / 2) + this.getOffset() - i))
				{
					System.out.print("*");
				}
				else
				{
					skipSpaces(1);
				}
			}
			System.out.println();
        }
	}
	public static void skipSpaces(int aSpaces)
	{
		for(int i = 0; i < aSpaces; i++)
		{
			System.out.print(" ");
		}
	}

}
