package core.java;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	
	public static void main(String[] args) {
		
		String str = "Hello Sravan!!! Hello";
		StringTokenizer strToken = new StringTokenizer(str,"!");
		
		System.out.println("Count: "+strToken.countTokens());
		while(strToken.hasMoreElements()){
			System.out.println("String Tokenizer: "+strToken.nextToken());
		}
		
		String strSp = "Hello| Sravan Hello";
		String[] strSplit = strSp.split("\\|");
		for (String string : strSp.split("\\a", 0)) {
//		for(String string : strSplit){
			System.out.println(string);
		}
		
//		String str = "varibale":"\"Y\"","value":"\"1\"","operator":"\"=\"";
		
	}
	
}
