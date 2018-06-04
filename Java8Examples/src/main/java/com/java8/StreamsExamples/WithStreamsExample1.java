package com.java8.StreamsExamples;

import java.util.Arrays;
import java.util.List;

public class WithStreamsExample1 {

	static List<Integer> numbers = Arrays.asList(10, 20, 0, 30, 35, 55);

	public static void printEvenNumbers(List<Integer> numbers) {
		
		numbers.stream()
		.filter((n)->n%2 ==0)
		.forEach(System.out::println);
		
		System.out.println("^^^^^^^^^^^^^^^^^");
		
		/*
		 * After streams, the List of numbers will be same as defined in beginning. 
		 * This will not change after applying filters or anything else
		 * 
		 */
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}
	
	public static void main(String[] args) {
		
		printEvenNumbers(numbers);
	}
}
