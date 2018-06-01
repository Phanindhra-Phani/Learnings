package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsUsingList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Om Prakash");
		list.add("Vani");
		list.add("Sravan");
		list.add("Sushma");
		list.add("Sandeep");
		list.add("Sanath");
		list.add("Annapurna");
		
		Iterator<String> strIterator = list.iterator();
		while(strIterator.hasNext()){
			System.out.println("List Value: "+strIterator.next());
		}
		
	}
}
