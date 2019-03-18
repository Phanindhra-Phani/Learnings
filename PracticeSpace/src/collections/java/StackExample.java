package collections.java;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.push("Sravan");
		stack.push("Sandy");
		stack.push("Sunny");
		
		System.out.println(stack);
		
		/*
		 * pop() deletes the last element of the stack and removes from stack
		 */
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		/*
		 * peek() returns Last element of the stack but doesn't delete
		 */
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
		System.out.println(stack.search("Sravan"));
		
		System.out.println(stack.search("Sandy"));
		
		System.out.println(stack.search("Sunny"));
		
		System.out.println(stack.empty());
	}

}
