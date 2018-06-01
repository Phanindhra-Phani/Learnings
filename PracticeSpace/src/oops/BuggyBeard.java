package oops;

import java.util.Set;
import java.util.TreeSet;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class BuggyBeard {

	public static void main(String args[]) {
		Set<Day> mySet = new TreeSet<Day>();
		mySet.add(Day.SATURDAY);
		mySet.add(Day.WEDNESDAY);
		mySet.add(Day.FRIDAY);
		mySet.add(Day.WEDNESDAY);
		for (Day d : mySet) {
			System.out.println(d);
		}
	}
}
