package collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class Test<T> {

class Parent {
	Parent display(int i) {
		System.out.println("Parent");
	return null;	
	}
}

class Child extends Parent {
	
	@Override
	Child display(int i) {
		System.out.println("Child");
	return null;	
	}
}

class Test extends Thread{
//	T field;
//	public Test(T field) {
//		this.field = field;
//	}
	
	static void sum(long l1, long l2) {
		System.out.println("log");
	}
	
	static void sum(float l1, float l2) {
		System.out.println("float");
	}
	
	static public void main(String[] args) {
		
//		for(int i=0; i<args.length;i++) {
//			System.out.println(args[i]);
//		}
		
		sum(10, 20);
		byte b = 65;
		
		switch(b) {
		default:
		{
			System.out.println("dsfkhskd");
			break;
		}
		case 'A':
		{
			System.out.println("dgfhjksfgjs");
		}
		}
		System.out.println(b);
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		
		System.out.println(Collections.binarySearch(list, 4));
		
		
		
//		Test<String> arr[] = new Test<String>[100];
//		
//		arr[0] = new Test("test");
//		arr[1] = new Test(1);
//		
//		arr[2] = (Test<String>) new Test(1);
		
	}

//	public static void main(String[] args) {
////		Test t  = new Test();
////		int i = t.check();
////		System.out.println(i);
//		
//		Date dt = new Date();
//		
//		System.out.println(dt.getDay());
//	}
//	
//	int check() {
//		try{
////			System.out.println("try block");
////			System.exit(0);
////			return 1;
//			throw new IOException();
//		} catch(Exception e) {
//			System.out.println("catch block");
//			return 2;
//		} finally {
//			System.out.println("finally block");
//			return 3;
//		}
//	}
}
