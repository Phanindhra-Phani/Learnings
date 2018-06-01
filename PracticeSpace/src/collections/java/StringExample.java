package collections.java;


public class StringExample {
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		String s31 = "HELLO";
		
		if(s1 == s31){
			System.out.println("Upper case");
		}else{
			System.out.println("Not matches");
		}
		

		System.out.println("Are String references equal? "+ (s1 == s2)); // returns true
		System.out.println("Strings are equal? "+s1.equals(s2));
		
		String s3 = new String("Hello").intern();
		System.out.println("Are String references equal? "+ (s1 == s3)); // returns true
		
		String s4 = new String("Hello").intern();
		String s5 = new String("Hello").intern();
		
		System.out.println("Are String references equal? "+ (s4 == s5)); // returns true
		
		System.out.println("Index of char 'l' is: "+s5.indexOf("lo")+" lastIndexOf: "+s5.lastIndexOf('l') + " Contins: "+s5.contains("lo"));
		
		String s6 = "HelloSravanHello Hello Hello";
		
		System.out.println("Actual Substring::"+s6.substring(6, 15));
		
//		System.out.println("Substring::"+s6.substring(1000)); // throws StringIndexOutOfBoundsException
		
		System.out.println("Substring::"+s6.substring(s6.length()));// returns empty since, start index includes.

		System.out.println("Length of String::"+s6.length());
		
		//Memory leak
		String s7 = s6.substring(0, 5);
		
		System.out.println("s7 value:: "+s7);
		
		String str = "Sravan";
		String btr = str.concat("Str");
		StringBuilder builder = new StringBuilder(str);
		String reverseStr =  builder.reverse().toString();
		System.out.println("Concat String: "+btr);
		System.out.println("Reverse of str: "+reverseStr);
	}

}
