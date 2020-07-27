package inheritance;
/*
 Define class "Parent1" with some data.
 Define interface "Parent2" with some data.
 Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.

 */
class Parent6
{
	public void disp()
	{
		System.out.println("Parent6 class disp method called");
	}
}
interface Parent7
{
	void disp();
}
class Child7 extends Parent6 implements Parent7
{
	/*public void disp()
	{
		System.out.println("Child7 class disp method is called");
	}*/
}
public class question7 {

	public static void main(String[] args) {
		Child7 c = new Child7();
		c.disp();
	}

}
