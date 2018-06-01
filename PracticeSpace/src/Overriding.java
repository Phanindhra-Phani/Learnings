

public class Overriding extends Test {
	
	final String NAME;
	
	public Overriding(){
		NAME = "Sravan Kumar";
	}
	
//	public static void print(){
//		System.out.println("Print static method in Sub class");
//	}
	
	
//	public void printL(){
//		System.out.println("Print non-static method in Sub class"+NAME);
//	}

//	public void getPrint() {
//		test.printL();	
//	}
	
	public Integer methodParent() {
		System.out.println("Method Child");
		return null;
	}
	public static void main(String[] args) {
		Test test = new Test();
		Test obj = new Overriding();
//		Overriding ov = new Overriding();
//		
//		test.print();
//		obj.print();
		obj.printL();
		Overriding.print();
//		obj.print();
//		ov.getPrint();
//		print();
		obj.printPlain();
		
		test.method1('a');
		
//		test.methodStr(null);
		
//		System.out.println("Name is:::"+NAME);
		
		obj.methodParent();
	}
}
