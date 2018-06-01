package collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Long> list1 = new ArrayList<>();
		
		list1.add(22l);
		list1.add(1l);
		list1.add(2l);
		list1.add(32l);
		
		List<Long> list2 = new ArrayList<>();
		
		list2.add(34l);
		list2.add(3l);
		list2.add(4l);
		list2.add(41l);
		
		if(list1.equals(list2)){
			System.out.println("True");
		}
		list1.addAll(list2);
//		for (Long long1 : list1) {
//			System.out.println("List 1 Values: "+long1);	
//		}
		
//		List<Long> list3 = new ArrayList<>(list1);
//		list3.addAll(list2);
		
		
		for (Long long1 : list1) {
			System.out.println("List 3 Values: "+long1);	
		}
		
		System.out.println("After sorting...");
		
		Collections.sort(list1);
		
		for (Long long1 : list1) {
			System.out.println("Sorded values: "+long1);	
		}
		
		Collections.sort(list1,Collections.reverseOrder());
		
		for (Long long1 : list1) {
			System.out.println("Reverse Sorded values: "+long1);	
		}
	}
	
}
