package collections.java;

public class ReverseAStringExample {

	public static void main(String[] args) {

		String str = "Sravan is a good and handsome guy";
		System.out.println("str value before reverse: " + str +"\n");
		
		reverseUsingCustomizedLogic(str);
//		reverseUsingStringBuilder(str);
		
		String reverse = reverseUsingRecursion(str);
		System.out.println("Reverse of a String using Recursion: "+reverse);
		
	}

	public static String reverseUsingRecursion(String str) {

		// Using Recursion
		System.out.println(str);
		if(str == null || str.length()<1)
			return str;
		return reverseUsingRecursion(str.substring(1))+str.charAt(0);

		
	}
	
	public static void reverseUsingCustomizedLogic(String str) {

		

		// Using customized logic

//		char[] strChar = str.toCharArray();
		int strLength = str.length();

		StringBuilder strBuilder = new StringBuilder();

		for (int i = strLength - 1; i >= 0; i--) {
			strBuilder = strBuilder.append(str.charAt(i));
		}
		System.out.println("str value after reverse using customized logic : " + strBuilder.toString());
	}

	public static void reverseUsingStringBuilder(String str) {

		

		// Using JAVA Standard API

		StringBuilder revStrBuilder = new StringBuilder(str);
		String revStr = revStrBuilder.reverse().toString();

		System.out.println("str value after reverse using JAVA API: " + revStr);
	}

}
