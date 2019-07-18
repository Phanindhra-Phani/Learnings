package com.datastructures.logicalprograms;

public class StackClient {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
//		stack.push(40);
//		stack.push(50);
//		stack.push(60);
//		stack.push(70);
//		stack.push(80);
//		stack.push(90);
//		stack.show();
//		int pop  = stack.pop();
//		System.out.println("Popped element is ::: "+pop);
//		System.out.println("Peeked element is ::: "+stack.peek()); 
		
		System.out.println("Is stack empty ::: "+ stack.isEmpty());
		
		stack.show();
		
		System.out.println("Size of stack ::: "+stack.size());
	}

}
