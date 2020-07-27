package demo1;

import emppack.Employee;

public class MyClass {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Vaibhav");
		e.setDesig("Developer");
		e.setSalary(50000);
		System.out.println(e.getName()+" is "+e.getDesig()+ " his salary is RS. "+e.getSalary()+" per month");
	}

}
