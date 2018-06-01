package collections.java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<Long> list1 = new ArrayList<>();
		list1.add(1l);
		list1.add(2l);
		list1.add(3l);
		list1.add(4l);
		
		ListIterator<Long> itr = list1.listIterator();
		while(itr.hasNext()){
			System.out.println("values:"+itr.next());
//			itr.remove();
			
//			itr.add(5l);
//			list1.remove(1l);
		}
		
		
//		Iterator<Long> itr1 = list1.iterator();
//		while(itr1.hasNext()){
//			System.out.println("values:"+itr1.next());
////			itr.remove();
//			
////			itr1.remove();
//			list1.remove(1l);
//		}
		
		
//		List<Long> subList = list1.subList(0, 3);
//		for (Long long1 : subList) {
//			System.out.println("Sub List::"+long1);
//		}
//		for (Long long1 : list1) {
//			System.out.println("After::"+long1);
//		}
		
	}
	
	

}
