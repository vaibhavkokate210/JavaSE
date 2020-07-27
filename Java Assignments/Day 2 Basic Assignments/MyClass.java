package Basic;
/*2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments
*/
public class MyClass {

	public MyClass()
	{
		System.out.println("Default Constructor Called");
	}
	public MyClass(int a)
	{
		System.out.println("One Parameterized Constructor called");
	}
	public MyClass(int a,int b)
	{
		System.out.println("Two parameterized constructor is called");
	}
	public static void main(String[] args) {
		MyClass m1=new MyClass();
		MyClass m2=new MyClass(10);
		MyClass m3=new MyClass(20,30);
		
	}

}
