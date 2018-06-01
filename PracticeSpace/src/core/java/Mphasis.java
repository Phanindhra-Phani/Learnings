package core.java;

import java.util.HashSet;
import java.util.Iterator;

public class Mphasis {
	
	public static void print(String str){
		
		if(str==null || str.isEmpty()){
			System.out.println("String is null");
		}else{
			System.out.println("String is not empty");
		}
	}
	
	public static void printSet(){
		
		HashSet<Object> hashObj = new HashSet<Object>();
		
		String str = "Sravan";
		
		hashObj.add(str);
		hashObj.add(new Integer(1));
		
		Iterator<Object> itr = hashObj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
	}
	
	public static void main(String[] args) {
		
		print(null);
		
		int i = new Integer(1) + new Integer(2);
		System.out.println(i);
		
		printSet();
		
	}

}
