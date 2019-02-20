
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ShapeInterface shape = new ShapeInterface(); //Cannot construct an interface
		ShapeInterface shape = new ShapeBasic();
		
		ShapeInterface[] shapes = new ShapeInterface[3];
		shapes[0] = new ShapeBasic();
		shapes[1] = new Rectangle(0,3,2);
		shapes[2] = new Rectangle(10,4,5);
		
		for(ShapeInterface s: shapes)
		{
			s.drawAt(5);
		}

	}

}
