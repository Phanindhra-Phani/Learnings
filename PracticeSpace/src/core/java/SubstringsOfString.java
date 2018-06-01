package core.java;

public class SubstringsOfString {
	
	public static int countSubStringsInString(String str){
		
		int length = str.length();
		String sub;
		int count = 0;
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j <= length-i; j++) {
				sub = str.substring(i,i+j);
				System.out.println(sub);
				if(!sub.isEmpty())
				count++;
			}
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int count = countSubStringsInString("1011");
		
		System.out.println("Total count: "+count);
	}
}
