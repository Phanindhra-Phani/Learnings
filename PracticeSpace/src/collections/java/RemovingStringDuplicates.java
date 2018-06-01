package collections.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingStringDuplicates {

	public static void main(String[] args) {
		removeDuplicatesUsingCollection();
		removeDuplicatesWithoutCollection();
	}

	public static void removeDuplicatesUsingCollection() {
		
		String str = "My name is Sravan Kumar";

		Set<Character> charSet = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			charSet.add(str.charAt(i));
		}

		StringBuilder strBuilder = new StringBuilder();
		for (Character charAtValue : charSet) {
			strBuilder.append(charAtValue);
		}

		System.out
				.println("After Duplicate removals using Collections: " + strBuilder.toString());

	}
	
	public static void removeDuplicatesWithoutCollection(){

		String str = "My name is Sravan Kumar";
		int strSize = str.length();
		System.out.println("Size of length: "+strSize);
		char ch;
		String afterDup = "";
		
		for(int i=0; i<strSize; i++){
			ch = str.charAt(i);
			if(ch!=' '){
				afterDup = afterDup+ch;
			}
			str = str.replace(ch, ' ');
		}
		
		System.out.println("After Duplicate removals without using Collections: "+afterDup);

	}

}
