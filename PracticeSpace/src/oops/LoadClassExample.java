package oops;

public class LoadClassExample {
	
	public static void main(String[] args) {
		
//		StaticTest staticTest = new StaticTest();
		
		try {
			Class.forName("oops.StaticTest");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
