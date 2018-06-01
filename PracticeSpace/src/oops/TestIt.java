package oops;

public class TestIt {
	
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		
		String[] str = new String[0];
		ReferenceNumberCheck.doIt(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]+" ");
		}
		
//		char[] myCharArray = {'A','b','c','d','e','f','g'};
//		ReferenceNumberCheck.blur(myCharArray, "Sravan");
		
		
//		String str1 = NULL;
//		System.out.println();
		
		int i = 0, j = 5; 

		tp: for(;;){
			
			i++;
			for(;;){
				if(i>--j){
					break tp;
				}
			}
		}
		
		System.out.println(i + " "+j);
		
		class Foo{
			
			 public int i = 3;
		}
		
		Object o = (Object)new Foo();
        Foo foo = (Foo)o;
        System.out.println("i = " + foo.i);
	}
	
	

}
