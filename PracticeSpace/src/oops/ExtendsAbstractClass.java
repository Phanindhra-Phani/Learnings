package oops;

public class ExtendsAbstractClass extends AbstractClass {
	
	public void printName(){
		name = "Sandeep";
		System.out.println(name);
		System.out.println("float default value: "+f + " *** double default value: "+d);
		
		System.out.println(new String("Sravan").intern() == new String("Sravan").intern());
		System.out.println(Integer.valueOf(50) == Integer.valueOf(50));
		System.out.println(Integer.valueOf(500) == Integer.valueOf(500));
		
		Integer x = 1000;
		Integer y = 1000;
		
		System.out.println(x==y);
		
		int x1 = 1000;
		int y1 = 1000;
		
		System.out.println(x1==y1);
		
	}
	
	public static void main(String[] args) {
		
		ExtendsAbstractClass ext = new ExtendsAbstractClass();
		ext.printName();
	}
	
}
