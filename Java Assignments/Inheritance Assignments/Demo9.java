package inheritance;
/*
 9) create interface "Game" , have an abstract method "play()". 
    from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
    Now Define one more class 
    public class Demo with main function.
    In this class have a static method "perform" which will take interface reference as parameter.
    inside "perform()" see to it that any child object passed ,its "play()" method should be invoked. 
    Call "perform()" method from main function.
 */
interface Game
{
	void play();
}
class Cricket implements Game
{
	public void play()
	{
		System.out.println("Cricket class play method called");
	}
}
class Football implements Game
{
	public void play()
	{
		System.out.println("Football class play method called");
	}
}
class Tennis implements Game
{
	public void play()
	{
		System.out.println("Tennis class play method called");
	}
}
public class Demo9 
{
     static void perform(Game g)
     {
    	g.play(); 
     }
     public static void main(String[] args)
     {
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());
	 }
}
