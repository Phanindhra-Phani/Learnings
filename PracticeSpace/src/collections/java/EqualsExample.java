package collections.java;

public class EqualsExample {

	public static void main(String[] args) {

		String str = new String("Sravan");
		String str1 = new String("Sravan");

		Long longValue = new Long(10l);
		Long longValue1 = new Long(10l);
		
		Long longValue2 = 101l;
		Long longValue3 = 101l;
		
		if (longValue2 == longValue3) {
			System.out.println("Both Longs are equal");
		} else {
			System.out.println("Longs are not equal");
		}

		if (str == str1) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		if (longValue == longValue1) {
			System.out.println("Both Longs are equal");
		} else {
			System.out.println("Longs are not equal");
		}

		if (str.equalsIgnoreCase(str1)) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		if (longValue.equals(longValue1)) {
			System.out.println("Both Longs are equal");
		} else {
			System.out.println("Longs are not equal");
		}

		Employee employee = new Employee();

		System.out.println("A value is::: " + employee.getA()
				+ "Integer Value::: " + employee.getNum());
	}
}
