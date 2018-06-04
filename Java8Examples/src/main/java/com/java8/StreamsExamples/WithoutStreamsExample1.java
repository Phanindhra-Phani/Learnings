package com.java8.StreamsExamples;

import java.util.Arrays;
import java.util.List;

public class WithoutStreamsExample1 {

	static List<Integer> numbers = Arrays.asList(10, 20, 0, 30, 35, 55);
	
	public static void main(String[] args) {
	
		WithoutStreamsExample1 wSE1 = new WithoutStreamsExample1();
		wSE1.printEvenNumbers(numbers);
		
	}
	
	public void printEvenNumbers(List<Integer> numbers) {
		
		for (Integer number : numbers) {
			if(number%2 == 0) {
				System.out.println(number);
//				numbers.remove(number); //UnsupportedOperationException is thrown
			}
		}
		
//		for (Integer number : numbers) {
//			System.out.println("Final List is"+number);
//		}
	}

}
