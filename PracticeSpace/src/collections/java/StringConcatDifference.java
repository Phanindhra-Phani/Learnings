package collections.java;

public class StringConcatDifference {
	
	public static void main(String[] args) {
		
		String s4 = "jobseeker";
		
		String s1 = s4.substring(1, 3);
		
		System.out.println("Substring value: "+s1);
		
		char[] ch = s1.toCharArray();
		
		for (char c : ch) {
			System.out.println(c);
		}
		
	}
}
