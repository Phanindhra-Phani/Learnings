package collections.java;

import java.util.ArrayList;
import java.util.List;

public class TrimToSizeInList {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.add(5);
		arraylist.add(6);
		arraylist.add(7);
		
		//Trims the memory to the size of list.
		arraylist.trimToSize();
		
//		System.out.println(arraylist);
		
//		StairCase(4);
		
//		int[] ar = {10,10,10};
//		sumArray(ar);
		
		TrimToSizeInList tr = new TrimToSizeInList();
		tr.start();
		
		List<String> mp = new ArrayList<String>();
		mp.add("jan");
		mp.add("dec");
		mp.add("feb");
		
		System.out.println(mp.contains("jan"));
		
	}
	
	static void StairCase(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j<=i ; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

    }
	
	static void sumArray(int[] numbers){
		
		int sum = 0;
		for (int i : numbers) {
			sum+=i;
		}
		
		System.out.println(sum);
	}

	void start() {
		String s1 = "slip";
		String s2 = fix(s1);
		System.out.println(s1 + " " + s2);
	}

	String fix(String s1) {
		s1 = s1 + "stream";
		System.out.print(s1 + " ");
		return "stream";
	}

}
