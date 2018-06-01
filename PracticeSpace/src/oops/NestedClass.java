package oops;

public class NestedClass {

	int number;
	
	static class innerClassString{
		String str = "static class";
		final String str1  = "Final Variable";
//		number = 999;
//		public void getStaticVariable(){
//			System.out.println(number);
//		}
	}
	
	public static void main(String[] args) {
		NestedClass.innerClassString nested = new NestedClass.innerClassString();
		System.out.println("String value from inner class: "+nested.str);
		nested.str = "Sravan";
		System.out.println("String value from inner class: "+nested.str);
		
	}
	
	public static void main() {
		System.out.println("adklf");
	}
	
	public static void getStaticVariable1(){
		NestedClass nc = new NestedClass();
		nc.getStaticVariable();
	}
	
	public void getStaticVariable(){
		getStaticVariable1();
	}
}

