package com.greatlearning.ques2;

public class Driver {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		tree.processBST(tree.node);
		tree.traverse(tree.newHead);
	}

}
