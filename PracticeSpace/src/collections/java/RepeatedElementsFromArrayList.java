package collections.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RepeatedElementsFromArrayList {

	public static void main(String[] args) {

		List<Long> duplicateList = new ArrayList<Long>();
		duplicateList.add(1l);
		duplicateList.add(3l);
		duplicateList.add(6l);
		duplicateList.add(8l);
		duplicateList.add(6l);
		duplicateList.add(8l);
		
		List<Long> combineList = new ArrayList<Long>();
		combineList.add(11l);
		combineList.add(31l);
		combineList.add(61l);
		combineList.add(81l);
		combineList.add(61l);
		combineList.add(81l);
		
		
		
		RepeatedElementsFromArrayList repeatedElementsFromArrayList = new RepeatedElementsFromArrayList();
		repeatedElementsFromArrayList.removeDuplicateElements(duplicateList);
//		repeatedElementsFromArrayList.combineTwoLists(duplicateList, combineList);
		
	}
	
	public void combineTwoLists(List<Long> duplicateList, List<Long> combinedList){
	
		duplicateList.addAll(combinedList);
		
		for (Long long1 : duplicateList) {
			System.out.println(long1);
		}
	}
	
	
	public void removeDuplicateElements(List<Long> duplicateList){
		Set<Long> alSet = new HashSet<Long>(duplicateList);
		
//		alSet.addAll(duplicateList);

		Iterator<Long> it = alSet.iterator();
		while(it.hasNext()){
			System.out.println("Element::"+it.next());
		}
		
	}
}
