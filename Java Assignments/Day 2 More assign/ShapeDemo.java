package More;
/*
 9)	Define a class “Shape” with “draw()” function . Now derive  classes like “Circle”, “Polygon”,”Rectangle” etc. 
    from “Shape” and override “draw()” function. Define a class “ShapeDemo” in which  write  main()  function. 
    In the main function create a reference to Shape class referring to any of the sub class. 
    Using this reference, call “draw()” and check the result.
 */

class Shape
{
	void draw()
	{
		System.out.println("Shape draw method called");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle draw method called");
	}
}
class Polygon extends Shape
{
	void draw()
	{
		System.out.println("Polygon draw method called");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Reactangle draw method called");
	}
}
public class ShapeDemo 
{
	/*public static void done(Shape s)
	{
		s.draw();
	}*/
	public static void main(String[] args) 
	{
		/*done(new Circle());
		done(new Polygon());
		done(new Rectangle());*/
		Shape s[] =new Shape[3];
		s[0]=new Circle();
		s[1]=new Polygon();
		s[2]=new Rectangle();
		for(int i=0;i<s.length;i++)
		{
			s[i].draw();
		}
	}
}
