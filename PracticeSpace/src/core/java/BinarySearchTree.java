package core.java;

public class BinarySearchTree {

	Node root;

	public void addNode(int key, String name) {

		Node newNode = new Node(key, name);

		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;

			while (true) {

				parent = focusNode;
				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;

					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}

				} else {
					focusNode = focusNode.rightChild;

					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}

		}
	}

	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			inOrderTraverseTree(focusNode.leftChild);

			System.out.println(focusNode);

			inOrderTraverseTree(focusNode.rightChild);
		}
	}

	public void preOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			System.out.println(focusNode);
			
			preOrderTraverseTree(focusNode.leftChild);

			preOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			System.out.println(focusNode);
			
			preOrderTraverseTree(focusNode.leftChild);

			preOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	public Node findNode(int key){
		
		Node focusNode = root;
		
		while(focusNode.key != key){
			
			if(key<focusNode.key){
				focusNode= focusNode.leftChild;
			}else{
				focusNode = focusNode.rightChild;
			}
		}
		
		if(focusNode == null){
			return null;
		}
		
		return focusNode;
		
	}

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();

		bst.addNode(50, "Boss");
		bst.addNode(25, "Vice Pres");
		bst.addNode(15, "Office Manager");
		bst.addNode(30, "Secretary");
		bst.addNode(75, "Sales Manager");
		bst.addNode(85, "Salesman");

		bst.inOrderTraverseTree(bst.root);
		
		System.out.println("Search for 30");
		System.out.println(bst.findNode(30));
	}

}

class Node {

	int key;
	String name;
	Node leftChild;
	Node rightChild;

	Node(int key, String name) {
		this.key = key;
		this.name = name;
	}

	public String toString() {
		return name + " has a key " + key;
	}
}