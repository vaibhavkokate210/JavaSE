package inheritance;
/*
 8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.
 */
class base8
{
	public base8(int a)
	{
		System.out.println("Parameterized constructor of base8 class-----a = "+a);
	}
}
class sub8 extends base8
{
	public sub8()
	{
		super(10);
		System.out.println("Default consrtuctor of sub8 class----");
	}
	public sub8(int a)
	{
		super(20);
		System.out.println("One parameter consrtuctor of sub8 class----a = "+a);
	}
	public sub8(int a,int b)
	{
		super(30);
		System.out.println("Two parameter consrtuctor of sub8 class----a = "+a+"----b= "+b);
	}
}
public class question8 {

	public static void main(String[] args) {
			sub8 s = new sub8();
			sub8 s1 = new sub8(40);
			sub8 s2 = new sub8(50,60);
					}

}
