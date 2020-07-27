package Basic;
/* 3) Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt ?
*/
class Emp
{
	private static int cnt=100;
	public static void main()
	{
		System.out.println("Value of cnt = "+cnt);
	}
}
public class Base3 {

	public static void main(String[] args) {
		Emp.main();

	}

}
