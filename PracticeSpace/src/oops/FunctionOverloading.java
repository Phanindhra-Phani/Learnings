package oops;

public class FunctionOverloading {

	Integer number = 100;
	
	public FunctionOverloading() {
		System.out.println("Empty method in super class");
	}

//	public String functionOverloading() {
//		return null;
//	}
	
	
	
	protected String functionOverloading(String s){
		System.out.println("Printing Super Class method :: "+s);
		return s;
	}
	
	protected String functionOver() throws Exception{
		return "Sravan";
	}
	
	protected void funtionOver(int... str) throws RuntimeException{
		System.out.println("In Varargs");
	}
	
	protected void funtionOver(int str){
		System.out.println("Not Varargs");
	}
	
	public static void fucntionName(){
		System.out.println("In static method");
	}
	
	public Object function(){
		System.out.println("In Object");
		return new Object();
	}
	
	
}
