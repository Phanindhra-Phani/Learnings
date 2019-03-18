package java2s;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HashTestWithLL {

	private String str;
    
    public HashTestWithLL(String str) {
        this.str = str;
    }
    
    @Override
    public String toString() {
        return this.str;
    }
        
    public static void main(String args[]) {
    	
    	HashTestWithLL h1 = new HashTestWithLL("2");        
        String s1 = new String("1");        
        
        List<Object> list = new LinkedList<Object>();
        list.add(h1);
        list.add(s1);
        
        /*
         * Commented since it throws Compilation Error
         */
//       Collections.sort(list);
        for (Object o : list) {
            System.out.print(o + " ");
        }
    	
        
        /*
         * On object class you cannot sort the data. Because, Object class can be anything. Its not kind of Unique data
         */
    	List<String> strList = new LinkedList<>();
    	
    	strList.add("def");
    	strList.add("abc");
    	
    	System.out.println(strList);
    	Collections.sort(strList);
    	System.out.println(strList);
    }
}
