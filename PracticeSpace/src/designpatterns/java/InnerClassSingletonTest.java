package designpatterns.java;

public class InnerClassSingletonTest {
	
	public void testSingleton() {

		InnerClassSingleton e1 = InnerClassSingleton
				.getInstance();
		InnerClassSingleton e2 = InnerClassSingleton
				.getInstance();

		if (e1 == e2) {
			System.out.println("Both are same");
		}
	}

	public static void main(String[] args) {
		InnerClassSingletonTest eagerInitializationSingletonTest = new InnerClassSingletonTest();
		eagerInitializationSingletonTest.testSingleton();
	}
}
