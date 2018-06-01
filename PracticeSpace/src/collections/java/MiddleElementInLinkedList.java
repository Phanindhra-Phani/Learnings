package collections.java;

import java.util.LinkedList;
import java.util.List;

public class MiddleElementInLinkedList {
	
	public static void main(String[] args) {
		
		List<String> strList = new LinkedList<String>();
		strList.add("Sravan");
		strList.add("Sushma");
		strList.add("Tejaswini");
		strList.add("Sandeep");
		strList.add("Sanath");
		strList.add("Vani");
		strList.add("Om Prakash");
		strList.add("Annapurna");
		
		int listSize = strList.size();
		
		System.out.println("List size: "+listSize);
		
		int middleElement = listSize/2;
		
		System.out.println("Middle Element: "+middleElement);
		
		System.out.println("Middle Element Value: "+ strList.get(middleElement));
	}

}
