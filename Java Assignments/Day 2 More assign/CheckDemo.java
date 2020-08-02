package More;
/*
 3)	Define a class “Check” in which declare member variables using  different accessibility modifiers i.e.
   <default>, private ,public and protected.   Define a function “disp”  which should be public.  
   Define a class “CheckDemo” in which you will write “main()” function. 
   Create an instance of  the class “Check” and  show how many  variables can be accessed directly and 
   how many indirectly.
 */
class Check
{
	int num1 =10;
	private int num2 =20;
	protected int num3 =30;
	public int num4 =40;
	public int disp()
	{
		return num2;
	}
}
public class CheckDemo {

	public static void main(String[] args) {
		Check c = new Check();
		System.out.println("public member = "+c.num4);
		System.out.println("protected member = "+c.num3);
		System.out.println("default member = "+c.num1);
		System.out.println("private member = "+c.disp());
		
	}

}
