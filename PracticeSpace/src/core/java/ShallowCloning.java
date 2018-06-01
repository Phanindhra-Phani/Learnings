package core.java;

import pojos.Employee;


public class ShallowCloning {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setCityName("Warangal");
		e1.setName("Sravan");
		
		Employee e2 = (Employee) e1.clone();
		
		System.out.println(e2.getName());
		
	}
	
}
