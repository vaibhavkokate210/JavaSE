package More;
//5)	Show the example of multi-level inheritance with constructor invocation.

class onee
{
	int num1 = 10;
	public onee()
	{  
		this(80);
		System.out.println("In default constructoe of class one");
	}
	public onee(int a)
	{
		System.out.println("In parameterized constructoe of class one");
	}
}
class twoo extends onee
{
	int num2 = 20;
	public twoo()
	{
		System.out.println("In default constructor of class two");
	}
	public twoo(int b)
	{
		super(60);
		System.out.println("In parameterized constructor of class two");
	}
}
class three extends twoo
{
	int num3 = 30;
	public three()
	{
		super(50);
		System.out.println("In default constructor of class threee");
	}
	public three(int c)
	{
		System.out.println("In parameterized constructor of class three");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		three t = new three();
		System.out.println(t.num1+"---"+t.num2+"----"+t.num3);
		//twoo t1 = new twoo(10);
	}

}
