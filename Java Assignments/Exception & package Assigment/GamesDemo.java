/*
 1)Create abstract base class "Game" with 'play()' as abstract method.
From that derive following classes.
Football,Cricket,Tennis
Create a class called as "GamesDemo" (public class)
inside a main method create an array of "Game" (3 elements)
Store objects of Football,Cricket and Tennis respectively.
Now traverse the array and call that Cricket's play() method.

 */
package Exception;

abstract class Game
{
	abstract void play();
}
class Football extends Game
{
	void play()
	{
		System.out.println("In Football Class");
	}
}
class Cricket extends Game
{
	void play()
	{
		System.out.println("In Cricket Class");
	}
}
class Tennis extends Game
{
	void play()
	{
		System.out.println("In Tennis Class");
	}
}
public class GamesDemo {

	public static void main(String[] args) {
		Game g[] = new Game[3];
		g[0] = new Football();
		g[1] = new Cricket();
		g[2] = new Tennis();
		for(int i = 0;i<3;i++)
		{
			if(g[i] instanceof Cricket)
			{
				g[i].play();
			}
		}
	}

}
