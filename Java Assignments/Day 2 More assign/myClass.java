package More;
/*
 7)	Define a parent and a child class . Now explain function overriding with Example.
 */
class Parent1
{
	void display()
	{
		System.out.println("Parent class display called");
	}
}
class childd extends Parent1
{
	void display()
	{
		System.out.println("Child class display called");
	}
}
public class myClass {

	public static void main(String[] args) {
		Parent1 p = new childd();
		p.display();
	}

}
