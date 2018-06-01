package generics;

public class GenericMethod {
	
	public <E> void printArrayValues(E[] elements){
	
		for(E ele : elements){
			System.out.println("Value is :"+ele);
		}
		
	}

	public static void main(String[] args) {
		
		Long[] longValues = {12l, 34l, 56l};
		String[] stringValues = {"Sravan","Sushma", "Vani","Om Prakash","Sandeep","Sanath","Annapurna"};
		
		GenericMethod genMethod = new GenericMethod();
		
		genMethod.printArrayValues(longValues);
		genMethod.printArrayValues(stringValues);
	}
}
