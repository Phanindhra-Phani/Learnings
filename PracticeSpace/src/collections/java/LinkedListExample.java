package collections.java;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Long> llist = new LinkedList<Long>();
		
		llist.add(17l);//2
		llist.addLast(8l);//3
		llist.add(10l);//4
		llist.addFirst(9l);//1
		LinkedList<Long> cloneList = (LinkedList<Long>) llist.clone();
		
//		System.out.println("removed:::"+cloneList.poll());
//		System.out.println("removed first:::"+cloneList.pollFirst());
//		System.out.println("removed last:::"+cloneList.pollLast());
		
		for (Object object : cloneList) {
			System.out.println(object);
		}
		
		Long[] l = llist.toArray(new Long[llist.size()]);
		
		System.out.println(l.length);
		
	}
}
