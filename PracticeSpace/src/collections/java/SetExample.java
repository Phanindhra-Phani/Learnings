package collections.java;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SetExample {
	
	
	public static void main(String[] args) {
//		setUsingHashSet();
		setUsingTreeSet();
	}
	
	public static void setUsingHashSet(){
		Collection<Long> setHash = new HashSet<Long>();
		setHash.add(12L);
		setHash.add(15L);
		setHash.add(10L);
		setHash.add(15L);
		
		Collection<Long> setHash1 = new HashSet<Long>();
		setHash1.add(11L);
		setHash1.add(10L);
		setHash1.add(14L);
		setHash1.add(16L);
		
		Collection<Long> setHash2 = new HashSet<Long>();
		setHash2.add(11L);
		setHash2.add(10L);
		setHash2.add(14L);
		setHash2.add(16L);
		
		if(setHash1.equals(setHash2)){
			System.out.println("Both Sets are Equal");
		}
		
		System.out.println("Before Size of set 1:"+setHash.size());
//		setHash.addAll(setHash1);
//		setHash.retainAll(setHash1);
		setHash.removeAll(setHash1);
		
		System.out.println("Size of set 1:"+setHash.size());
		for (Object object : setHash) {
			System.out.println("Hash: "+object);
		}
		
		Iterator<Long> et = setHash1.iterator();
		while(et.hasNext()){
			System.out.println("Iterator Hash1:"+et.next());
		}
	}
	
	public static void setUsingTreeSet(){
		Set<Long> setHash = new TreeSet<Long>();
		setHash.add(12L);
		setHash.add(15L);
		setHash.add(10L);
		
		for (Object object : setHash) {
			System.out.println("Tree:"+object);
		}
	}

}
