package Basic;

/* 4) Define a class "DemoOb". 
create an instance of it.
now create a reference and assign the reference created in the above statement.
	Discuss what happens?
Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
(For ur discussion, write necessary comments in the program)*/

public class DemoOb {

	public static void main(String[] args) {
		DemoOb d =new DemoOb();
		DemoOb d1=d;
		d=new DemoOb();
		/* at first object created, object is created with refernece d.then we created 
		   reference of DemoOb type d1 and assigned reference d to it.so now d1 will
		   refer where d is refering.now we assigned new instance to d then it will
		   be refer to new instance.now d1 refers to one instace and d refers to latest instance.
		  */
	}

}
