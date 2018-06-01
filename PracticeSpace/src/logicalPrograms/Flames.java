package logicalPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Flames {
	
	public static void countFlames(String str, String str1){
		
		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
		
		int length1 = ch.length;
		int length2 = ch1.length;
		int count=0;
		if(ch1.length>=ch.length){
			for(int i=0; i<ch1.length; i++){
				Pattern pattern = Pattern.compile("[" +ch1[i] +"]");
				Matcher matcher = pattern.matcher(str);
				
				if(matcher.find()){
					System.out.println(ch1[i]);
					str = str.replaceFirst("[" + ch1[i]+"]", "");
					System.out.println(str);
					
					++count;
				}
			}
		}else{
			for(int i=0; i<ch.length; i++){
				Pattern pattern = Pattern.compile("[" +ch[i] +"]");
				Matcher matcher = pattern.matcher(str1);
				
				if(matcher.find()){
					System.out.println(ch[i]);
					str1 = str1.replaceFirst("[" + ch[i]+"]", "");
					System.out.println(str1);
					++count;
				}
			}
		}
		
		int flamesCount = (length1+length2)-(count*2);
		System.out.println(flamesCount);
		
		findRelation(flamesCount);
		
	}
	
	public static void findRelation(int flamesCount){

		String flamesResult = "";
		String fResult[] = { "FRIENDS", "LOVERS", "AFFECTION", "MARRIAGE",
				"ENEMIES", "SWEETHEARTS" };
		int k = 0;
		for (int i = 5; i > 0; i--) {
			int j = 1;
			while (j < flamesCount) {
				k++;
				if (k == fResult.length)
					k = 0;
				j++;
			}
			String fResult1[] = new String[i];
			int m = 0;
			for (int kk = 0; kk < fResult.length; kk++)
				if (kk != k)
					fResult1[m++] = fResult[kk];
			fResult = fResult1;
			if (k == fResult.length)
				k = 0;
			flamesResult = fResult[0];
		}
		System.out.println("Final Output : " + flamesResult);
		
	}
	//http://freesourcecode.blogspot.com/2006/02/who-i-am-to-you-hum-aapke-hai-kaun.html
	
	public static void findFlamesCount(){
		
		String name1 = "Sravan";
		String name2 = "Sushma";
		String difference = "";
		
		for( int i=0; i<name1.length(); i++ ){
			String a = name1.charAt(i) + "";
			if( name2.indexOf( a ) != -1 ){
				name2 = name2.replaceFirst( a, "" );
			}else{
				difference += a;
			}
		}
	difference += name2;
	System.out.println(difference.length());
	
	findRelation(difference.length());
	}
	public static void main(String[] args) {
//		countFlames("Vijay", "Kalyani");
		findFlamesCount();
	}

}
