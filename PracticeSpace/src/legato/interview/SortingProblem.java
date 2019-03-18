package legato.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * If given input as [A,B,C,D,E,a,b,c,d,e]
 * it should be coming as [A,a,B,b,C,c,D,d,E,e] 
 */
public class SortingProblem {
	
	public static void main(String[] args) {
		
		String[] alphaArray = {"A","C", "B" ,"a", "c" ,"b"}; //[A,a,B,b]
		
		List<String> list = Arrays.asList(alphaArray);
		
//		Collections.sort(list, new StringComparator());
		
		Collections.sort(list, ((s1, s2) -> (s1.toUpperCase()).compareTo(s2.toUpperCase())));
		
		System.out.println(list);
		
	}

}
