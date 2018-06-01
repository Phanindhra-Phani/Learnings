package collections.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("Sravan");
		strList.add("Sushma");
		strList.add("Sandeep");
		strList.add("Sanath");
		strList.add("Vani");
		strList.add("Prakash");
		strList.add("Annapurna");
		
		for(Iterator<String> itr = strList.iterator(); itr.hasNext();){
			System.out.println(itr.next());
		}
		
//		Iterator<String> itr = strList.iterator();
//		
//		while(itr.hasNext()){
//			System.out.println("Elements in List using Iterator:  "+itr.next());
//			itr.remove();
//		}
		
		ListIterator<String> lItr = strList.listIterator();
		while(lItr.hasNext()){
			String element = (String) lItr.next();
			System.out.println("Elements before modification:: "+element);
			lItr.set(element+" Pala");
		}
		
		Iterator<String> itr = strList.iterator();
		while(itr.hasNext()){
			System.out.println("Elements in List using Iterator after updating:  "+itr.next());
		}
		
		while(lItr.hasPrevious()){
			System.out.println("Elements in reverse:: "+lItr.previous());
		}
	}
}
