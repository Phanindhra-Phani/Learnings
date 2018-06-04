package com.java8.StreamsExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExamplesWithDiffMethods {

	static List<Integer> numbers = Arrays.asList(34, 56, 23, 45, 67, 12);
	static List<String> names = Arrays.asList("Sravan", "Sandeep", "Sanath", "Sushma", "Tejaswini");
	
	public static void main(String[] args) {

		/*
		 * Use count()
		 */
		Long count = names.stream().filter(n -> n.startsWith("S")).count();
		System.out.println(count);
	
		/*
		 * Sorting by default with ascending order
		 * The following line of code will sort the list in natural ordering.
		 */
		numbers.stream().sorted().forEach(System.out::println);
		
		/*
		 * Sorting by Comparator.reverseOrder() to descending order
		 * To reverse the natural ordering Comparator provides reverseOrder() method. We use it as follows.
		 */
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		/*
		 * Sorting the names in ascending order
		 * The following line of code is using Comparator to sort the list.
		 */
		names.stream().sorted(Comparator.comparing((String n)->n)).forEach(System.out::println);

		/*
		 * Sorting the names in descending order
		 * To reverse the ordering, Comparator provides reversed() method. We use this method as follows.
		 */
		names.stream().sorted(Comparator.comparing((String n)->n).reversed()).forEach(System.out::println);
		
		/*
		 * To get minimum of the Stream
		 */
		String smin = names.stream().min(Comparator.reverseOrder()).get();
		System.out.println(smin.toString());
		
		/*
		 * To get maximum of the Stream
		 */
		String smax = names.stream().max(Comparator.reverseOrder()).get();
		System.out.println(smax);
		
		
		//Stream.of(numbers).min(Comparator.comparing(Integer::valueOf)).get();
		
		/*
		 * Using collections
		 */
//		Collections.sort(names, ((s1, s2) -> s2.compareTo(s1)));
//		System.out.println(names);
//		Collections.sort(names, ((s1, s2) -> s1.compareTo(s2)));
//		System.out.println(names);
	}
	
	

}
