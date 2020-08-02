package More;
/*
 6)	Show the example of hierarchical inheritance with constructor invocation.
 */

class parent
{
	public parent()
	{
		System.out.println("parent class default constructor called");
	}
	
}
class child1 extends parent
{
	public child1()
	{
		System.out.println("child1 class default constructor called");
	}
}

class child2 extends parent
{
	public child2()
	{
		System.out.println("child2 class default constructor called");
	}
}

class child3 extends parent
{
	public child3()
	{
		System.out.println("child3 class default constructor called");
	}
}
public class Hierachical {

	public static void main(String[] args) {
		child1 c1 = new child1();
		child2 c2 = new child2();
		child3 c3 = new child3();
	}

}
