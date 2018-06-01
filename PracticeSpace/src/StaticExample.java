
public class StaticExample {
	
	static int i=10;
	
	static {
		method_1();
		System.out.println("First static block");
	}
	
	public static void main(String[] args) {
		
		System.out.println(i);
		method_1();
	}
	
	public static void method_1() {
		System.out.println(j);
	}
	
	static {
		System.out.println("Second static block");
	}
	
	static int j=20;

}

