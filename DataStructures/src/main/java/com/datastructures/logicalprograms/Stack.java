package com.datastructures.logicalprograms;

public class Stack {
	
	
	int capacity = 2;
	int stack[] = new int[capacity];
	int index = 0;
	
	public void push(int data) {
		
		if(size() == capacity ) 
			expand();
		
		stack[index] = data;
		index++;
	}
	public void expand() {
		
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, size());
		stack = newStack;
		capacity *= 2;
		
	}
	
	public int pop() {
		
		index--;
		
		int data = stack[index];
		stack[index] = 0;
		
		return data;
	}
	
	public int peek() {
		
		return stack[index-1];
	}

	public void show() {
		
		for (int n : stack) {
			System.out.println(n);
		}
	}
	
	public boolean isEmpty() {
		
		return stack.length<=0;
	}
	
	public int size() {
		return index;
	}
}
