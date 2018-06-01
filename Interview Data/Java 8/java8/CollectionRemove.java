package java8;

import java.util.ArrayList;
import java.util.List;

public class CollectionRemove {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("Tom Jones", 45, 7000.00));
	    employeeList.add(new Employee("Harry Major", 25, 10000.00));
	    employeeList.add(new Employee("Ethan Hardy", 65, 8000.00));
	    employeeList.add(new Employee("Nancy Smith", 22, 12000.00));
	    employeeList.add(new Employee("Deborah Sprightly", 29, 9000.00));
	    
	    employeeList.removeIf((Employee emp) -> emp.getAge() >= 30);
	    System.out.println("Employees below the age of 30");
	    employeeList.forEach(System.out::println);
	}
}
