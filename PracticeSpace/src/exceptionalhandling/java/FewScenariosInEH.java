package exceptionalhandling.java;

public class FewScenariosInEH {

	public static void main(String[] args) {
		
		FewScenariosInEH fewScenariosInEH = new FewScenariosInEH();
		
		try{
		fewScenariosInEH.numberFormatExceptionMethod();
		}catch(NumberFormatException nfx){
			System.out.println("Error thrown while parsing");
		}

	}
	
	public void numberFormatExceptionMethod() throws NumberFormatException{
//		try{
		String name = "Sravan";
		Integer intNumber = Integer.parseInt(name);
		
		System.out.println("Integer value is :"+intNumber);
//		}catch(NumberFormatException nfe){
//			System.out.println("Error thrown while Parsing");
//		}
	}
}
