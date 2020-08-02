package More;
/*
 10)	Define an interface “Vechicle” with “start()” function . 
 Now derive  classes like “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc. 
 from “Vehicle” and override “start()” function. Define a class “VDemo” in which  write  main()  function. 
 In the main function create a reference to Vehicle  class referring to any of the sub class. 
 Using this reference, call “start" method.
 */
interface vehicle
{
	void start();
}
class TwoWheeler implements vehicle
{
	public void start()
	{
		System.out.println("TwoWheeler start method called");
	}
}
class ThreeWheeler implements vehicle
{
	public void start()
	{
		System.out.println("ThreeWheeler start method called");
	}
}
class FourWheeler implements vehicle
{
	public void start()
	{
		System.out.println("FourWheeler start method called");
	}
}
public class VDemo {

	public static void main(String[] args) {
         vehicle v[] =new vehicle[3];
         v[0] = new TwoWheeler();
         v[1] = new ThreeWheeler();
         v[2] = new FourWheeler();
         for(int i=0;i<v.length;i++)
         {
        	 v[i].start();
         }
	}

}
