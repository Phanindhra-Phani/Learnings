package oops;

public class StaticTest {
	
	static{
		System.out.println("Static Block3");
	}
	
	static{
		System.out.println("Static Block");
	}
	
	static{
		System.out.println("Static Block2");
	}
	
	public StaticTest(){
		System.out.println("In Constructor");
	}
	
	public static void main(String[] args) {
		
		String str = "Sravan" + "Kumar" + "Pala"+123;
		str.concat("2432423");
		
		String strOccur = "SravanHello Sravan Hello Sravan Sravan Sravan Hello";
		
		System.out.println("String Value::: "+str);
		
		String s = "Sravan";
		
		String s1 = "Sravan";
		
		if(s == s1){
			System.out.println("Both are same");
		}
		
		String s2 = new String("Sravan").intern();
		
		if(s1 == s2){
			System.out.println("Both are same");
		}else{
			System.out.println("Not equal");
		}
	}

}
