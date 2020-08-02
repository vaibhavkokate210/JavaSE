package More;
/*
 2)	Create a class with static and non-static member variables. 
    Define static and non-static member functions.
    Create instance of this class and call both static and non-static member functions.
 */
public class StatDemo {

	static int num1 = 100;
	int num2 =200;
	public static void main()
	{
		System.out.println("Static method invoked");
	}
	void display()
	{
		System.out.println("Non static method "+num2);
	}
	public static void main(String[] args) {
		System.out.println("static = "+num1);
		num1 =200;
		main();
		StatDemo s = new StatDemo();
		System.out.println("Non-static = "+s.num2);
		s.num2=300;
		s.display();
	}

}
