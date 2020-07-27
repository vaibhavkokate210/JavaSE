package inheritance;
/*
 5) create abstract class Shape. declare "draw()" function as abstract. 
    From this class define "Triangle","Polygon" and "Circle" .
    create an array of Shape having 3 elements.
    store child objects into this array . and call
    their draw function.
 */
abstract class Shape
{
	abstract void draw();
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Triangle class draw method");
	}
}
class Polygon extends Shape
{
	void draw()
	{
		System.out.println("Polygon class draw method");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("circle class draw method");
	}
}
public class question5 {

	public static void main(String[] args) {
		Shape s[]=new Shape[3];
		s[0]=new Triangle();
		s[1]=new Polygon();
		s[2]=new Circle();
		for(int i=0;i<s.length;i++)
		{
			s[i].draw();
		}
	}

}
