package com.java8.StreamsExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WithStreamsUsingFunctionExample2 {
	
	static List<Integer> numbers = Arrays.asList(10, 20, 0, 30, 35, 55);
	
	static List<Double> doubleNumbers = Arrays.asList(10.5, 23.4);

	public static void printDoubleOfNumber(List<Integer> numbers) {
		
		List<Integer> doubleOfInteger = numbers.stream()
		.map(n->n*2)
		.collect(Collectors.toList());
		
		System.out.println(doubleOfInteger);
		
	}
	
	private static <T> void printConditionally(List<T> numbers, Function<T, T> function) {
		
		List<T> doubleOfInteger = numbers.stream()
		.map(n->function.apply((T)n))
		.collect(Collectors.toList());
		
		System.out.println(doubleOfInteger);
		
	}
	
	public static void main(String[] args) {
		printDoubleOfNumber(numbers);
		
		/*
		 * Using Function.class which is a Functionalnterface
		 */
//		Function<Integer, Integer> functionMultiplyBy3 = (n)->n*3;
		printConditionally(numbers, (n)->n*3);
		
//		Function<Integer, Integer> functionMultiplyBy4 = (n)->n*4;
		printConditionally(numbers, (n)->n*4);
		
		printConditionally(doubleNumbers, (n)->n*2);
	}
}

