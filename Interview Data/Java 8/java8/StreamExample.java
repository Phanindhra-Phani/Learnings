package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		
		//Removes empty String from the list
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		filtered.forEach(System.out::println);
		
		//Definition: forEach iterate each element of the stream.
		//Print random 10 numbers
		Random random = new Random();
		random.ints(10).forEach(System.out::println);
		
		//Definition: map method is used to map each element to its corresponding result.
		//Print Unique squares of numbers
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		squaresList.forEach(System.out::println);
		
		//Definition: filter element is used to eliminate elements based on a criteria.
		//Count empty Strings using filter using stream
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Using Stream:  "+count);
		
		//Definition: limit method is used to reduce the size of the stream.
		//Print random numbers using limit()
		random.ints().limit(10).forEach(System.out::println);
		
		//Definition: sorted method is used to sort the stream.
		//Print random numbers using limit() and sorted() for the sorted order
		random.ints().limit(10).sorted().forEach(System.out::println);
		
		//Definition: parallelStream is the alternative of the stream for Parallel processing. 
		//Count empty Strings using filter using parallelStream
		count = strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println("Using Parallel Stream:  "+count);
		
		//Definition: Collectors are used to combine the result of processing on the elements of a Stream. It returns either List or String.
		//returns only  String comma separated using Collectors.joining
		String mergedString = filtered.stream().collect(Collectors.joining(", "));
		System.out.println("Merged String:::"+mergedString);
		
		//Definition: Statistics collectors are introduced to calculate all statistics when stream processing in java
		IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Highest number in List:"+stats.getMax());
		System.out.println("Lowest number in List:"+stats.getMin());
		System.out.println("Sum of all numbers"+stats.getSum());
		System.out.println("Avg of all numbers"+stats.getAverage());
	}
}
