package legato.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnModifiableCollectionExample {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Sravan");
		list.add("Sandeep");
		list.add("Sanath");
		
		Collection<String> immutableList = Collections.unmodifiableList(list);
		
		System.out.println(immutableList);
		
		immutableList.add("Sushma");
	}

}
