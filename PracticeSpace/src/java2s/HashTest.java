package java2s;

import java.util.HashSet;

public class HashTest {
    
    private String str;
    
    public HashTest(String str) {
        this.str = str;
    }
        
    @Override
    public int hashCode() { 
    	System.out.println(this.str + "hashcode::: "+ this.str.hashCode());
        return this.str.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) { 
    	System.out.println("equals::: "+ this.str.equals(obj.toString()));
    	HashTest ht = (HashTest) obj;
        return this.str.equals(ht.str);
    }
    
    public static void main(String args[]) {
        HashTest h1 = new HashTest("1");
        HashTest h2 = new HashTest("1");
        String s1 = new String("2");
        String s2 = new String("2");
        
        HashSet<Object> hs = new HashSet<Object>();
        hs.add(h1);
        hs.add(h2);
        hs.add(s1);
        hs.add(s2);
        
        System.out.print(hs.size());
    }
}