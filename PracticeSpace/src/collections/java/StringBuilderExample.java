package collections.java;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		String str = "This "+ "is "+"Sravan Kumar";
		
		StringBuilder strBuilder = new StringBuilder("This ").append("is ").append("Sravan Kumar");
		System.out.println(str);
		System.out.println(strBuilder);
	}
}
