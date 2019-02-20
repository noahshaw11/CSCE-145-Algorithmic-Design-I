
public class Rectangle extends ShapeBasic implements RectangleInterface {
	private int width, length;
	public Rectangle()
	{
		super(); //Call to ShapeBasic default constructor
		this.width = this.length = 1;
	}
	public Rectangle(int anOffset, int aW, int aL)
	{
		super(anOffset); //Call to ShapeBasic parameterized constructor
		this.set(aW, aL);
	}
	public int getWidth()
	{
		return this.width;
	}
	public int getLength()
	{
		return this.length;
	}
	public void set(int aW, int aL)
	{
		if(aW >= 1 && aL >= 1)
		{
			this.length = aL;
			this.width = aW;
		}
	}
	public void drawHere() //Override
	{
		for(int i = 0; i < this.length; i++)
		{
			skipSpaces(super.getOffset());
			for(int j = 0; j < this.width; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
