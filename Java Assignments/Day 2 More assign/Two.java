package More;
/*
 1)	Define 2 classes “First” and “Second” with member variables , member functions and 
 constructors of  your choice. Now define a class “Two” in which define main function . 
 In main function create various instances of First and Second  and call their individual member functions.
 */
class first
{
	int num1 =10;
	public first()
	{
		System.out.println("In first class constructor");
	}
	void display()
	{
		System.out.println("Num1 of first class = "+num1);
	}
}
class second
{
	int num2 = 20;
	public second()
	{
		System.out.println("In second class constructor");
	}
	void display()
	{
		System.out.println("Num2 of second class = "+num2);
	}
}
public class Two 
{
	public static void main(String[] args)
	{
		first f = new first();
		second s = new second();
		f.num1 =100;
		f.display();
		s.display();
	}

}
