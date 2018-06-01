package collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayListUsingMethod {
	
	public static void main(String[] args) {
		
		SynchronizedArrayListUsingMethod synchronizedArrayListUsingMethod = new SynchronizedArrayListUsingMethod();
		
		synchronizedArrayListUsingMethod.synchronizeUsingCollectionMehod();
		
		synchronizedArrayListUsingMethod.synchronizeUsingCopyOnWriteArrayList();
	}
	
	//Synchronizing ArrayList using Collections.synchronized() method
	public void synchronizeUsingCollectionMehod(){
		
		List<Long> synchList = Collections.synchronizedList(new ArrayList<Long>());
		
		synchList.add(1l);
		synchList.add(19l);
		synchList.add(20l);
		
		synchronized (synchList) {
			Iterator<Long> itr = synchList.iterator();
			while(itr.hasNext()){
				System.out.println("Elements in Synchronized block:::"+itr.next());
			}
		}
	}

	//Synchronize ArrayList using CopyOnWriteArrayList
	public void synchronizeUsingCopyOnWriteArrayList(){
		
		CopyOnWriteArrayList<Long> synchList = new CopyOnWriteArrayList<Long>();
		
		synchList.add(1l);
		synchList.add(19l);
		synchList.add(20l);
		
		Iterator<Long> itr = synchList.iterator();
		while(itr.hasNext()){
			System.out.println("Elements in Synchronized block:::"+itr.next());
		}
	}
}
