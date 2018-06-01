package collections.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CountOccurences {
	
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(12);
		integerList.add(9);
		integerList.add(12);
		integerList.add(9);
		integerList.add(10);
		integerList.add(11);
		
		CountOccurences occurences = new CountOccurences();
		occurences.countOccurencesUsingCollections(integerList);
		
	}
	
	/* Count Occurences using collection */
	
	public void countOccurencesUsingCollections(List<Integer> integerList){
		Map<Integer, Integer> countOccurences = new HashMap<Integer, Integer>();
		for (Integer integer : integerList) {
			Integer count=0;
			if(countOccurences.containsKey(integer)){
				count = countOccurences.get(integer)+1;
				countOccurences.put(integer, count);
			}else{
				countOccurences.put(integer, count+1);
			}
		}
		Iterator<Map.Entry<Integer,Integer>> itr = countOccurences.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Integer, Integer> pair = (Map.Entry<Integer, Integer>)itr.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
	}
	
}
