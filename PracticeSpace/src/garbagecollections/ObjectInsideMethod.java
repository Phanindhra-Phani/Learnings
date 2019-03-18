package garbagecollections;

public class ObjectInsideMethod {

	String str_obj_name;
	
	public ObjectInsideMethod(String str_obj_name) {
		this.str_obj_name = str_obj_name;
	}
	
	static void show() {
		ObjectInsideMethod objInsideMethod = new ObjectInsideMethod("First Object");
		display();
	}

	static void display() {
		ObjectInsideMethod objInsideMethod = new ObjectInsideMethod("Second Object");
	}
	
	public static void main(String[] args) {
		show();
		
		System.gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.str_obj_name + ": Successfully Garbage Collected");
	}
}

