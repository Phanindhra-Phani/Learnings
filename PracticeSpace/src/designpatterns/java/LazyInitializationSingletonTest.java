package designpatterns.java;

public class LazyInitializationSingletonTest {
	
	public void testSingleton() {

		LazyInitializationSingleton e1 = LazyInitializationSingleton
				.getInstance();
		LazyInitializationSingleton e2 = LazyInitializationSingleton
				.getInstance();

		if (e1 == e2) {
			System.out.println("Both are equal");
		}
	}

	public static void main(String[] args) {
		LazyInitializationSingletonTest eagerInitializationSingletonTest = new LazyInitializationSingletonTest();
		eagerInitializationSingletonTest.testSingleton();
	}

}
