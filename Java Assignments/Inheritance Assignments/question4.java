package inheritance;
/*
 4) Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.
 */
class top1
{
	void disp1()
	{
		System.out.println("Top1 class Disp1 Method");
	}
}
class Bottom4 extends top1
{
	void disp1()
	{
		System.out.println("Bottom1 class Disp1 Method");
	}
}
class Bottom5 extends top1
{
	void disp1()
	{
		System.out.println("Bottom2 class Disp1 Method");
	}
}
class Bottom6 extends top1
{
	void disp1()
	{
		System.out.println("Bottom3 class Disp1 Method");
	}
}
public class question4 {

	public static void main(String[] args) {
		Bottom4 b =new Bottom4();
		Bottom5 b1 =new Bottom5();
		Bottom6 b2 =new Bottom6();
		b.disp1();
		b1.disp1();
		b2.disp1();
	}

}
