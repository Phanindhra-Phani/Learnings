package core.java;

public class VarargsExample {
	
	public static void varargsEx(Integer... integer){
		System.out.println("In Integer Varargs method");
		
		for (Integer integerValue : integer) {
			System.out.println("Value: "+integerValue);
		}
	}
	
	public static void main(String[] args) {
		
		varargsEx();
		varargsEx(9);
		varargsEx(9, 26);
		
	}

}
