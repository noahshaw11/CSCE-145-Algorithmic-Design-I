
/*
 * Written by JJ Shepherd
 */
import java.applet.*; //Needed to create the window
import java.awt.*; //Needed for drawing
import java.util.*;
public class DrawingLines extends Applet{//When it extends applet it creates a window and calls certain methods

	private Image display; //Used as the flat image
	private Graphics drawingArea; //Used to draw item in the image

	/*
	 *This is called by the parent Applet, as its an overridden method, and it initializes all of the instance variables.
	 * Think of this as a variation of a constructor, but called by another, hidden piece of code
	 */
	public void init()
	{
		//get the height and width from the Applet
		int height = getSize().height; 
		int width = getSize().width;
		//Creates an image using the height and width in the applet
		display = createImage(width,height);
		//Sets up the drawing area for the image above to be drawn on
		drawingArea = display.getGraphics();
		//This draws the lines
		drawLines(drawingArea);
	}
	/*
	 * This is also called by
	 * the applet as it is an overridden method. 
	 */
	public void paint(Graphics g)
	{
		g.drawImage(display,0,0,null);
	}
	/*
	 * This Draws line!
	 */
	public void drawLines(Graphics g)
	{
		Color[] colors = {Color.black,Color.blue,Color.red,Color.green,Color.darkGray};
		Line[] lines = new Line[5];
		lines[0] = new SlopedLine(1);
		lines[1] = new SineLine(100,0.25);
		lines[2] = new ExponentialLine(1.25);
		lines[3] = new StaircaseLine(20,20);
		lines[4] = new SawLine(50);
		
		final int X_POINTS = 1000;
		
		for(int i=0;i<X_POINTS;i++)
		{
			for(int j=0;j<lines.length;j++)
			{
				if(lines[j]==null)
					continue;
				g.setColor(colors[j]);
				g.drawLine(i, getSize().height - (int)lines[j].getYPoint(i), i+1, getSize().height - (int)lines[j].getYPoint(i+1));
			}
		}
	}

}
