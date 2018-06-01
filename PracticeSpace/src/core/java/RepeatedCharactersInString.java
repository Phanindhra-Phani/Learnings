package core.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RepeatedCharactersInString {
	
	public static void main(String[] args) {
		
		String str = "sushma Regonda ";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++){
			Character chc = str.charAt(i);
			if(charMap.containsKey(chc)){
				Integer repeatedValue = charMap.get(chc);
				charMap.put(chc, repeatedValue+1);
			}else{
				charMap.put(chc, 1);
			}
		}
		
		Iterator<Map.Entry<Character, Integer>> itr = charMap.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Character, Integer> mapEntry = itr.next();
			System.out.println("Character** "+mapEntry.getKey() +" Occurence^^ "+mapEntry.getValue());
		}
		
	}

}
