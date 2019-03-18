package saptient.onlinetest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBinarySearch {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(5);
		
		System.out.println(Collections.binarySearch(list, 5));
	}
}
