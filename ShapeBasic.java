
public class ShapeBasic implements ShapeInterface {
	private int offset;
	public ShapeBasic()
	{
		this.offset = 0;
	}
	public ShapeBasic(int anOffset)
	{
		this.setOffset(anOffset);
	}
	public int getOffset()
	{
		return this.offset;
	}
	public void setOffset(int anOffset)
	{
		if(anOffset >= 0)
		{
			this.offset = anOffset;
		}
	}
	public void drawHere()
	{
		skipSpaces(this.offset);
		System.out.println("*");
	}
	public void drawAt(int lineNumber)
	{
		for(int i = 0; i < lineNumber; i++)
		{
			System.out.println();
		}
		drawHere();
	}
	public static void skipSpaces(int aSpaces)
	{
		for(int i = 0; i < aSpaces; i++)
		{
			System.out.print(" ");
		}
	}

}
