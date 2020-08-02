package devShape;

import clientpro.*;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s[]=new Shape[3];
		s[0] =new Triangle();
		s[1]= new Rect();
		s[2]=new Circle();
		
		for(int i = 0;i<3;i++)
		{
			s[i].draw();
		}
	}

}
