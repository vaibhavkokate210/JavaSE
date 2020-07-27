package inheritance;
/*
 1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.
    Also show, if needed how will u invoke parent class constructor from child class ?
 */

class parent1
{
	/*public parent1()
	{
		System.out.println("Default constructor of parent class....");
	}*/
	public parent1(int a)
	{
		System.out.println("Parametrized constructor of parent class.....a = "+a);
	}
}
class child1 extends parent1
{
	public child1()
	{
		super(40);
		System.out.println("Default constructor of child1 class");
	}
	public child1(int b)
	{
		super(60);
		System.out.println("Parameterized constructor of child1 class....b ="+b);
	}
}
class child2 extends child1
{
	public child2()
	{
		System.out.println("Default constructor of child2 class");
	}
	public child2(int c)
	{
		super(20);
		System.out.println("Parametrized constructor of child1 class.....c ="+c);
	}
}
public class MultiLevel1 {

	public static void main(String[] args) {
		child2 c =new child2(10);

	}

}
