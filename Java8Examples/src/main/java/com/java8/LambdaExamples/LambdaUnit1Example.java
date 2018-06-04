package com.java8.LambdaExamples;

import java.util.Arrays;
import java.util.List;

public class LambdaUnit1Example {

public static List<String> people = Arrays.asList("Sravan", "Sandeep", "Sunny", "Sushma","Tejaswini");
	
	public static void main(String[] args) {

		people.forEach(System.out::println);
		
		people.stream()
		.filter((person)->person.startsWith("T"))
		.forEach(System.out::println);
		
		Thread t = new Thread(()->System.out.print("Thread Start"));
		t.start();
	}
}
