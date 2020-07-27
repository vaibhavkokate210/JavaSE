package demo2;

import studpack.Student;

public class MyClass {

	public static void main(String[] args) {
		Student s =new Student();
		s.setName("Vaibhav");
		s.setAddress("Sangli");
		s.setAge(25);
		System.out.println(s.getName()+" is from "+s.getAddress()+" and "+s.getAge()+" years old");
	}

}
