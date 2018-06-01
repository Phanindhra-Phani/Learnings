package core.java;

public class MainTest {

	 static String country = "India";
	 String code = "IND";
	 String name;
	 
	 MainTest(String name, String code){
		 this.name = name;
		 this.code = code;
		 System.out.println("I am in constructor");
	 }
	 
	 void display(){
		 System.out.println(country+" "+ code+ " "+name);
	 }
	 
	 public static void main(String[] args) {
		MainTest t1 = new MainTest("Sravan", "IND");
		MainTest t2 = new MainTest("Sandeep","IND");
		
		t1.display();
		t2.display();
		
	}
	 
	static{
		System.out.println("In Static block");
	}
	
	{
		System.out.println("In Instance block");
	}
}
