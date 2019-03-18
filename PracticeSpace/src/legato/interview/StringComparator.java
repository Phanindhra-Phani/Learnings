package legato.interview;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		//{"A","C", "B" ,"a", "c" ,"b"}
		return str1.toUpperCase().compareTo(str2.toUpperCase());
	}

}
