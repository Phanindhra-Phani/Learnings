
public class Test {

//	Test test = new Test();
	public  Test(){
		System.out.println("Sravan Kumar");
	}
	
	public static void print(){
		System.out.println("Print static method");
	}
	
	public final void printL(){
		System.out.println("Print non-static and final method");
	}
	
	public void printPlain(){
		System.out.println("Print printPlain method");
	}
	
	public void method1(int i) {
		System.out.println(i);
	}
	
	public void method1(float f) {
		System.out.println(f);
	}
	
	public void methodStr(String s) {
		System.out.println(s);
	}
	
	public void methodStr(StringBuffer sb) {
		System.out.println(sb);
	}
	
	
	public Object methodParent() {
		System.out.println("Method Parent");
		return null;
	}
}
