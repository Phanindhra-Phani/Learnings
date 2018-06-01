package core.java;

public class TestClass {

	public TestClass() {
		System.out.println("In Constructor");
	}

	public static final void main(String[] args) {
		System.out.println("In Main method");

		TestClass t1 = new TestClass();
		TestClass t2 = new TestClass();
	}

	static {
		System.out.println("In Static block");
	}

	{
		System.out.println("In Instance block");
	}
}
