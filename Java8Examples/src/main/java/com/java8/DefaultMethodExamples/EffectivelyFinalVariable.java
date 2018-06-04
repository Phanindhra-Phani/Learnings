package com.java8.DefaultMethodExamples;

public class EffectivelyFinalVariable {
	
	int x = 10;
	
	public void m1() {
		
		/*
		 * This "y" which is local variable is defined as final variable. Because this Lambda expression can be executed anywhere in the
		 * application.
		 * 
		 * The local variables which are referenced from Lambda expressions are Final variables or Effectively final variables
		 */
		int y=20;
		
		TestFunctionalInterface tFI = () -> {
			System.out.println(x);
			System.out.println(y);
		};
		
		tFI.test();
	}
	
	public static void main(String[] args) {
		
		EffectivelyFinalVariable eFV = new EffectivelyFinalVariable();
		
		eFV.m1();
	}
	
	

}
