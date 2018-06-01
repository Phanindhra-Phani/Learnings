package collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SwapExampleUsingList {
	
	public static void main(String[] args) {
		List<Long> list1 = new ArrayList<>();
		list1.add(1l);
		list1.add(2l);
		list1.add(3l);
		list1.add(4l);
		
		for (Long long1 : list1) {
			System.out.println("Before Swapping:::"+long1);	
		}
		
		Collections.shuffle(list1, new Random());
		
		
		
//		SwapExampleUsingList swapEx = new SwapExampleUsingList();
//		swapEx.swap(list1, 1, 2);
//		
		for (Long long1 : list1) {
			System.out.println("After Swapping:::"+long1);	
		}
	}
	
	
	public void swap(List<Long> a, int i, int j){
		
		Long temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
		
	}
	
	

}
