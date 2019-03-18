package collections.java;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(12);
		pq.add(1);
		pq.add(35);
		pq.add(1);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
	}

}
