package collections.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		
//		Hashtable<Long, String> hashTable = new Hashtable<Long, String>();
//		hashTable.put(null, "Sravan");

		Map<Long, String> hasMap = (HashMap<Long, String>) Collections.synchronizedMap(new HashMap<Long, String>());
		
		
		synchronized(hasMap){
			
		}
		hasMap.put(null, "Sravan");
		
		System.out.println(hasMap.get(null));
	}
}
