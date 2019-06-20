package com.dxe;

public class A {
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.returnTest());
	}
	
	public int returnTest() {
		
		
		try {
			throw new Exception();
//			return 1;
		} catch(Exception e) {
			
			return 2;
		} finally {
			return 3;
		}
		
	}
	
}
