package core.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NthHighestElementInArray {
	
	public static void main(String[] args) {
		findNthElementUsingCollection();
//		findNthElementWithoutUsingCollection();
	}
	
	public static void findNthElementUsingCollection(){
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(34);
		intList.add(86);
		intList.add(9);
		intList.add(26);
		intList.add(66);
		
		Collections.sort(intList);
		
		for (Integer integer : intList) {
			System.out.println(integer);
		}
		
		Integer size = intList.size();
		
		System.out.println("3rd Highest Element: " +intList.get(size-3));
		
	}
	
	public static void findNthElementWithoutUsingCollection(){
		
		int[] a = new int[]{12,3,433,232};
		int temp;
		
		for(int i=0; i<4; i++){
			for(int j=i+1; j<4; j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i]= a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Highest Element is: "+a[2]);
	}

}
