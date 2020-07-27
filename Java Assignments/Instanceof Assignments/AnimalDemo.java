package instance;
/*
 create a hierarchy

				Animal

					void makeSound()
					
override "makeSound()" in all the child classes.

		Dog		Cat	    	Tiger
					    void hunting()

write a class "AnimalDemo" with main and perform functions

	perform function should be defined in such a way that it can accept any animal and invoke "makeSound()" function.

	also make sure if "Tiger" is passed , its "hunting()" method also should be called.
 */
class Animal
{
	void makeSound()
	{
		System.out.println("Animal sound called");
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Bho-bho");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("mau-mauuuuuu");
	}
}
class Tiger extends Animal
{
	void makeSound()
	{
		System.out.println("bruuuuuuuuuuuuuuuu");
	}
	void hunting()
	{
		System.out.println("Tiger Is hunting");
	}
}
public class AnimalDemo {
		static void perform(Animal a)
		{
			if(a instanceof Tiger)
			{
				Tiger t =(Tiger) a;
				t.hunting();
			}
			a.makeSound();
		}
	public static void main(String[] args) {
		perform(new Dog());
		perform(new Cat());
		perform(new Tiger());
	}

}
