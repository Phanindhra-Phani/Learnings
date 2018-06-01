package java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComparatorReplacement {

	public static void main(String[] args) {
		
		List<DeveloperDetails> developerDetailsList = getDevelopers();
		developerDetailsList.forEach((developer) -> System.out.println(developer));
		
		//java 8 only, lambda also, simple sort without using comparator in ascending order
		developerDetailsList.sort((DeveloperDetails dd1, DeveloperDetails dd2) -> dd1.getAge()-dd2.getAge());

		//java 8 only, lambda also, simple sort without using comparator in descending order
		developerDetailsList.sort((DeveloperDetails dd1, DeveloperDetails dd2) -> dd2.getAge()-dd1.getAge());

//		Need to work on this
//		developerDetailsList.sort((DeveloperDetails dd1, DeveloperDetails dd2) -> dd2.getSalary()-dd1.getSalary());
		
		developerDetailsList.forEach((developer) -> System.out.println(developer));
	}
	
	private static List<DeveloperDetails> getDevelopers() {
		List<DeveloperDetails> result = new ArrayList<DeveloperDetails>();
		result.add(new DeveloperDetails("selvester", 33, new BigDecimal("70000")));
		result.add(new DeveloperDetails("alvin", 20, new BigDecimal("80000")));
		result.add(new DeveloperDetails("jason", 10, new BigDecimal("100000")));
		result.add(new DeveloperDetails("iris", 55, new BigDecimal("170000")));
		return result;
	}
}
