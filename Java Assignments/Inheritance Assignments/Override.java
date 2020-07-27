package inheritance;
/*
 2) create a class "Vehicle", define a method "public void start()" in it. 
 From this class derive a class FourWheeler. How will u override "start()" method of parent class ?
 */
class vehicle
{
	public void start()
	{
		System.out.println("In vehicle class start method");
	}
}
class FourWheeler extends vehicle
{
	public void start() 
	{
		System.out.println("In FourWheeler class start method");
	}
}
public class Override {

	public static void main(String[] args) {
		FourWheeler w =new FourWheeler();
		w.start();
	}

}
