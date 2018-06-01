package generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericsUsingMap {

	public static void main(String[] args) {
		
		Map<Long, String> mapGenerics = new HashMap<Long, String>();
		mapGenerics.put(1l, "Om Prakash");
		mapGenerics.put(2l, "Vani");
		mapGenerics.put(3l, "Sravan");
		mapGenerics.put(4l, "Sushma");
		mapGenerics.put(5l, "Sandeep");
		mapGenerics.put(6l, "Sanath");
		mapGenerics.put(7l, "Annapurna");
		
		Set<Map.Entry<Long, String>> setMap = mapGenerics.entrySet();
		
		Iterator<Entry<Long, String>> itrMap = setMap.iterator();
		
//		Iterator<Long> itrMap = mapGenerics.keySet().iterator();
//		Iterator<String> itrMap = mapGenerics.values().iterator();
		while(itrMap.hasNext()){
			
			Map.Entry<Long, String> singleMap = itrMap.next(); 
			System.out.println("Key : "+singleMap.getKey() + " ** Value is :"+singleMap.getValue());
		}
		
	}
}
