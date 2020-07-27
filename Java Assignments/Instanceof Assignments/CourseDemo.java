package instance;
/*
 create a hierarchy

        				Course

					void start()
					void end()

override "start()" and "end()" in all the child classes.

		MsCit		Basic		Dbda
							void orientation()

write a class "CourseDemo" with main and perform functions

	perform function should be defined in such a way that it can accept any course 
	and invoke "start()" and "end()" functions.

	also make sure if "Dbda" is passed , its "orientation()" method also should be called.
 */

class Course
{
	void start()
	{
		System.out.println("Course class start method");
	}
	void end()
	{
		System.out.println("course class end method");
	}
}
class MsCit extends Course
{
	void start()
	{
		System.out.println("MSCIT class start method");
	}
	void end()
	{
		System.out.println("MSCIT class end method");
	}
}
class Dac extends Course
{
	void start()
	{
		System.out.println("DAC class start method");
	}
	void end()
	{
		System.out.println("DAC class end method");
	}
}
class Dbda extends Course
{
	void start()
	{
		System.out.println("DBDA class start method");
	}
	void end()
	{
		System.out.println("DBDA class end method");
	}
	void orientation()
	{
		System.out.println("DBDA class Orientation method");
	}
	
}
public class CourseDemo 
{
	static void perform(Course c)
	{
		if(c instanceof Dbda)
		{
			((Dbda) c).orientation();
		}
		c.start();
		c.end();
	}
	public static void main(String[] args) 
	{
		perform(new MsCit());
		perform(new Dac());
		perform(new Dbda());
	}
}