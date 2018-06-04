package com.java8.StreamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutStreamsExample2 {

	static List<Integer> numbers = Arrays.asList(10, 20, 0, 30, 35, 55);

	public static void main(String[] args) {
		
		List<Integer> doubleOfNumber = fetchDoubleOfNumber(numbers);
		System.out.println("Double of number::::"+doubleOfNumber);
		
		List<Integer> tripleOfNumber = fetchTripleOfNumber(numbers);
		System.out.println("Triple of number::::"+tripleOfNumber);
	}

	private static List<Integer> fetchDoubleOfNumber(List<Integer> numbers) {
		
		List<Integer> doubleOfNumbers = new ArrayList<>();
		
		for (Integer integer : numbers) {
			doubleOfNumbers.add(integer*2);
		}
		
		return doubleOfNumbers;
	}
	

	private static List<Integer> fetchTripleOfNumber(List<Integer> numbers) {
		
		List<Integer> tripleOfNumbers = new ArrayList<>();
		
		for (Integer integer : numbers) {
			tripleOfNumbers.add(integer*3);
		}
		
		return tripleOfNumbers;
	}
}
