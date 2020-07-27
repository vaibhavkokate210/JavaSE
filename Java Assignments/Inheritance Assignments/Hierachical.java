package inheritance;
/*
 3) Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.
 */
class top
{
	top()
	{
		System.out.println("in top class constructor");
	}
	void disp()
	{
		System.out.println("in top class disply");
	}
}
class bottom extends top
{
	bottom()
	{
		System.out.println("in bottom class consrtuctor");
	}
	void disp()
	{
		System.out.println("in bottom class disply");
	}
}
class bottom1 extends top
{
	bottom1()
	{
		System.out.println("in bottom1 class consrtuctor");
	}
	void disp()
	{
		System.out.println("in bottom1 class disply");
	}
}
class bottom2 extends top
{
	bottom2()
	{
		System.out.println("in bottom2 class consrtuctor");
	}
	void disp()
	{
		System.out.println("in bottom2 class disply");
	}
}
public class Hierachical {

	public static void main(String[] args) {
		bottom b= new bottom();
		bottom1 b1 =new bottom1();
		bottom2 b2 =new bottom2();
		b.disp();
		b1.disp();
		b2.disp();

	}

}
