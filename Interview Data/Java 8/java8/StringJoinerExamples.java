package java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExamples {

	public static void main(String[] args) {
		
		//String Joiner with delimitter
		StringJoiner sj = new StringJoiner(", ");
		sj.add("abc");
		sj.add("def");
		sj.add("ghi");
		
		String result = sj.toString(); //abc, def, ghi
		
		System.out.println("Simple String Joiner: "+result);
		
		//String Joiner with delimitter, prefix and suffix
		StringJoiner sj1 = new StringJoiner("/", "Dt-", "-end");
		sj1.add("2017");
		sj1.add("02");
		sj1.add("26");
		String result1 = sj1.toString(); //prefix-2016/02/26-suffix
		System.out.println(result1);
		
		 String result2 = String.join("-", "2015", "10", "31" );
		 System.out.println(result2);
		 
		 List<String> list = Arrays.asList("java", "python", "nodejs", "ruby"); //java, python, nodejs, ruby
		    
	    String result3 = String.join(", ", list);
	    System.out.println(result3);
	   
	    List<String> list1 = Arrays.asList("java", "python", "nodejs", "ruby"); //java | python | nodejs | ruby
	    String result4 = list1.stream().map(x->x).collect(Collectors.joining(" | "));
	    System.out.println(result4);
		
	}
}
