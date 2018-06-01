package collections.java;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
	
		strList.add("");
		strList.add(1, "abc");
		strList.add(11, "bcd");
		
		for (String string : strList) {
			System.out.println("String values:::"+string);
		}
	}
}
