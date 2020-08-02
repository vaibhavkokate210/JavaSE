package More;
/*
 4)	Show the example of single level inheritance with constructor invocation.
 */

class one
{
	public one(int a)
	{
		System.out.println("In one class Constructor");
	}
	int num1 = 100;
	void disp()
	{
		System.out.println("class one disp method");
	}
}
public class single extends one
{
	public single()
	{
		super(10);
		System.out.println("In single class constructor");
	}
   int num1 =200;
   void disp()
   {
	   System.out.println("class single disp method");
   }
	public static void main(String[] args) {
		single s = new single();
		System.out.println(s.num1);
		s.disp();
		s.num1 = 300;
		System.out.println(s.num1);
	}

}
