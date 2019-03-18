package saptient.onlinetest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("1", "two");
		map.put(2, "four");
		
		System.out.println("This is map "+map);
		System.out.println("These are keys");
		
		displayMap(map.keySet());
		
	}

	private static void displayMap(Set keySet) {
		
		Iterator itr = keySet.iterator();
		while(itr.hasNext()) {
			String s =  (String) itr.next();
			System.out.println(s +" ");
		}
		
	}

}
