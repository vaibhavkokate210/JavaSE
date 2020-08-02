package More;
/*
 8)	Define a parent class with one function. Define child class with the function having same name as of parent class 
 function,but having different argument.
Create an instance of child class and call the functions. 
Make sure u have followed the concept of “function overloading “ in inheritance.
 */
class father
{
	void salary()
	{
		System.out.println("salary of father in More");
	}
}
class son extends father
{
	void salary(int a)
	{
		System.out.println("salary of Son in less");
	}
}
public class overload {

	public static void main(String[] args) {
		son s = new son();
		s.salary();
		s.salary(100);
	}

}
