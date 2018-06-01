package generics;

public class UseMyGenericsClass {
	
	public static void main(String[] args) {
		
		MyGenerics<String> myGener = new MyGenerics<String>();
		myGener.add("Sravan");
		
		System.out.println("Name is :"+myGener.getName());
	}

}
