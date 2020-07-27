package inheritance;
/*
 6) Define interface "A" with "disp1()" method.
    Derive from "A", interface "B" with "disp2" method.
    Derive class "C" , from "B".
    Instantiate class "C" and call its members as well as derived from parent interfaces.
 */
interface A
{
	void disp1();
}
interface B extends A
{
	void disp2();
}
class C implements B
{
	public void disp1()
	{
		System.out.println("disp1 Method is called from C class");
	}
	public void disp2()
	{
		System.out.println("disp2 Method is called from C class");
	}
}
public class question6 {

	public static void main(String[] args) {
		
			B c =new C();
			c.disp1();
			c.disp2();
	}

}
