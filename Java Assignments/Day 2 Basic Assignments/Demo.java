package Basic;
/*5) Define 3 classes A , B and C
in all these classes create static and nonstatic variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. 
	From this main function try to access all the members of A ,B  and C.
	
6) define static initializers in the above A,B and C classes and 
   check the order of their execution.
	*/
class A
{
   int a =10;
   static int a1 = 20;
   public void MyClassA()
   {
	   System.out.println("In class A");
   }
   static
   {
	   System.out.println("In A static block");
   }
}
class B
{
	int b = 30;
	static int b1 =40;
	static
	   {
		   System.out.println("In B static block");
	   }
	public void MyClassB()
	   {
		   System.out.println("In class B");
	   }
}
class C
{
	private static int c = 50;
	public static void main()
	{
		System.out.println("private static c = "+c);
	}
	static
	   {
		   System.out.println("In C static block");
	   }
	public void MyClassC()
	   {
		   System.out.println("In class C");
	   }
}
public class Demo {
	
	public static void main(String[] args) {
		A a =new A();
		B b= new B();
		C c= new C();
		a.MyClassA();
		System.out.println(a.a);
		System.out.println(A.a1);
		b.MyClassB();
		System.out.println(b.b);
		System.out.println(B.b1);
		c.MyClassC();
		C.main();
	}

}
