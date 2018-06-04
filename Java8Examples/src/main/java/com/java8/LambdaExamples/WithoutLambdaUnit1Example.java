package com.java8.LambdaExamples;

import java.util.Arrays;
import java.util.List;

public class WithoutLambdaUnit1Example {

	
	public static List<String> people = Arrays.asList("Sravan", "Sandeep", "Sunny", "Sushma","Tejaswini");
	
	public static void main(String[] args) {
		for (String person : people) {
			System.out.println(person);
		}
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread start");
				
			}
		});
		t.start();
	}
}
