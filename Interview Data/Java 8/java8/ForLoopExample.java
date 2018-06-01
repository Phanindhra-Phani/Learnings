package java8;

import java.util.Arrays;
import java.util.List;

public class ForLoopExample {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 4, 6, 7, 9, 10);
		
		integerList.forEach((Integer value) -> System.out.println(value));
		
		integerList.forEach((value) -> System.out.println(value));
		
		integerList.forEach(value -> System.out.println(value));
		
		integerList.forEach(System.out::println);
	}
}
