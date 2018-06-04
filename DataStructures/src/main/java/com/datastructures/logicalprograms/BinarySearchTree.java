package com.datastructures.logicalprograms;

import java.util.Arrays;
import java.util.List;

class Node {

	int data;
	Node left;
	Node right;
}

class BinarySearchTreeFunctions {
	
	private Node createNewNode(Integer number) {
		
		Node node = new Node();
		
		node.data = number;
		node.left = null;
		node.right = null;
		
		return node;
	}

	public Node insertNode(Node node, Integer number) {
		
		if( null == node ) {
			node = createNewNode(number);
		} 
		
		if (number < node.data) {
			node.left = insertNode(node.left, number);
		} else if (number > node.data) {
			node.right = insertNode(node.right, number);
		}
		return node;
	}

}

public class BinarySearchTree {

	public static void main(String[] args) {
		
		BinarySearchTreeFunctions binarySearchTreeFunctions = new BinarySearchTreeFunctions();
		Node root = null;
		
		List<Integer> numberList = Arrays.asList(10, 6, 8, 13, 16, 11, 56, 28);
		
		for(Integer number : numberList) {
			root = binarySearchTreeFunctions.insertNode(root, number);
		}
	
		System.out.println("Out of BST");
	}
	
}

