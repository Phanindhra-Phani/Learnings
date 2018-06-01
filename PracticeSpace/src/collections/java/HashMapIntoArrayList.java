package collections.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIntoArrayList {

	public static void main(String[] args) {
		
		Map<String, String> mapStr = new HashMap<String, String>();

		mapStr.put("Head", "Annapurna");
		mapStr.put("Father", "Om Prakash");
		mapStr.put("Mother", "Vani");
		mapStr.put("Younger Brother", "Sandeep");
		mapStr.put("Youngest Brother", "Sanath");
		
		Iterator<Map.Entry<String, String>> itrMapStr = mapStr.entrySet().iterator();
		while(itrMapStr.hasNext()){
			Map.Entry<String, String> singleEntry = itrMapStr.next();
			System.out.println("Key: "+singleEntry.getKey() + " Value: "+singleEntry.getValue());
		}
		
		List<String> keyList = new ArrayList<String>(mapStr.keySet());
		for (String string : keyList) {
			System.out.println("Key in List: "+string);
		}
		
		List<String> valueList = new ArrayList<String>(mapStr.values());
		for (String string : valueList) {
			System.out.println("Key in List: "+string);
		}
		
		List<Entry> entryList = new ArrayList<Entry>(mapStr.entrySet());
		for (Entry entry : entryList) {
			System.out.println("Entry into List: "+entry);
		}
	}
}
