package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardGenericsSuper {
	
	public void getElements(List<? super Long> elements){
		
		for(Object obj : elements){
			System.out.println("Value is:"+obj);
		}
	}
	
	public static void main(String[] args) {
		
		WildCardGenericsSuper wildCardGenericsSuper = new WildCardGenericsSuper();
		
		List<Long> longList = new ArrayList<Long>();
		longList.add(26l);
		longList.add(9l);
		
		wildCardGenericsSuper.getElements(longList);
	}

}
