package oops;

public class ReferenceNumberCheck {
	
	static void doIt(int[] z){
//		int temp = z[z.length-1];
//		z[0] = temp;
		
//		int[] A = z;
//		A[0] = 99;
		
//		z[0] = 0;
		
//		int temp = z[z.length-1];
//		z[z.length-1] = z[0];
//		z[0] = temp;
		
		z = null;
	}
	
	static void blur(char[] z, String str){
		
		if(z.length<str.length())
			return;
		
		for (int i = 0; i < str.length(); i++) {
			z[i] = str.charAt(i);
		}
		
		for (int i = 0; i < z.length; i++) {
			System.out.println(z[i]);
		}
	}

}

