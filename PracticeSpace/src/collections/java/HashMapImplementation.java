package collections.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {

	public static void main(String[] args) {
		Map<Employee,String> empMap = new HashMap<Employee,String>();
		
		for (int i = 0; i < 50; i++) {
			empMap.put(new Employee(), ""+i );
		}
		
		System.out.println("empMap size:"+empMap.size());
	}
	
}
