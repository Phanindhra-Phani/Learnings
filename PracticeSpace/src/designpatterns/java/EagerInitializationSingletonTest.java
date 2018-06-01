package designpatterns.java;

public class EagerInitializationSingletonTest {

	public void testSingleton() {

		EagerInitializationSingleton e1 = EagerInitializationSingleton
				.getInstance();
		EagerInitializationSingleton e2 = EagerInitializationSingleton
				.getInstance();

		if (e1 == e2) {
			System.out.println("Both are same");
		}
	}

	public static void main(String[] args) {
		EagerInitializationSingletonTest eagerInitializationSingletonTest = new EagerInitializationSingletonTest();
		eagerInitializationSingletonTest.testSingleton();
	}

}
