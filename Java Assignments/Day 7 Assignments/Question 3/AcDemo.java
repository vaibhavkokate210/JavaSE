package Day7Assign;

abstract class Account
{
	abstract void calcInt();
}
class Saving extends Account
{
	void calcInt()
	{
		System.out.println("Saving class calcInt method called");
	}
}
class Current extends Account
{
	void calcInt()
	{
		System.out.println("Current class calcInt method called");
	}
}
class RD extends Account
{
	void calcInt()
	{
		System.out.println("RD class calcInt method called");
	}
}
public class AcDemo {

	static void perform(Account a)
	{
		if(a instanceof Saving)
		{
			a.calcInt();
		}
	}
	public static void main(String[] args) {
		
		perform(new Saving());
		perform(new Current());
		perform(new RD());
	}

}
