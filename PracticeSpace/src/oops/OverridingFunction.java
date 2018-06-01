package oops;

public class OverridingFunction extends FunctionOverloading {
	
	Integer number = 200;
	
	static{
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	public OverridingFunction(){
		System.out.println("In  OverridingFunction Constructor");
	}
	
	@Override
	public String functionOverloading(String s) {
		System.out.println("Printing Sub Class method :: "+s);
		return s;
	}
	
	@Override
	public Long function(){
		System.out.println("In Long");
		return new Long(12);
	}
	
	@Override
	public String functionOver(){
		return "Sravan";
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		
//		OverridingFunction func = new OverridingFunction();
		
		//Only loads the class
//		Class.forName("oops.OverridingFunction");
//		//Loads and initilize class(like static blocks)
//		ClassLoader.getSystemClassLoader().loadClass("oops.OverridingFunction");
		
		FunctionOverloading func = new OverridingFunction();
		func.function();
//		func.functionOverloading("Sravan");
//		
//		func.functionOverloading();
//		
//		func.funtionOver(32);
//		System.out.println("Data Member: "+func.number);
	}
}


