package com.datastructures.logicalprograms;

public class NumberOfStrings {

	public static void main(String[] args) {
		
		String str = "abcde";
		
		int strLength = str.length();
		
		int strCount = strLength*(strLength+1)/2; 
		
		System.out.println(strCount);
		
	}
}
