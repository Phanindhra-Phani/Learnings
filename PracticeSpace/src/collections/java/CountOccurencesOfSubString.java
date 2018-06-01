package collections.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOccurencesOfSubString {

	public static void main(String[] args) {

		String s6 = "HelloSravan Hello Hello Hello";

		System.out.println("Matches: " + s6.matches("(.*)Sravan(.*)"));

		// Count the occurences of substring

		Pattern pattern = Pattern.compile("Hello");
		Matcher matcher = pattern.matcher(s6);

		int occurences = 0;

		while (matcher.find()) {
			occurences++;
		}

		System.out.println("Occurences of Hello: " + occurences);
	}
}
