package collections.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaticBlock {

	StaticBlock(int i){
		System.out.println("I am in construtor");
		
	}
	
	static{
		System.out.println("Initialzed");
	}
	
	public static void main(String[] args)  throws Exception{
		Class.forName("collections.java.StaticBlock");
		
		//intern usage

//		String a = "abc";
//		String a1 = new String("abc").intern();
//		System.out.println(a==a1);
		
		
		List<String> strList = new ArrayList<String>();
		strList.add("1");
		strList.add("ab");
		strList.add("c");
		strList.add("bc");
		
		Iterator<String> it = strList.iterator();
		while(it.hasNext()){
//			System.out.println(it.next());
			if(it.next().equalsIgnoreCase("ab")){
				it.remove();
			}
			
		}
		
	}
}
