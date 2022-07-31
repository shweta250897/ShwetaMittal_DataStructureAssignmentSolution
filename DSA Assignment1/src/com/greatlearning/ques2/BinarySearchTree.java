package com.greatlearning.ques2;

class Node {
	int val;
	Node left, right;

	Node(int val) {
		this.val = val;
		left = right = null;
	}
}

public class BinarySearchTree {

	Node node;
	Node prev = null;
	Node newHead = null;

	public void processBST(Node root) {
		if (root == null)
			return;
		processBST(root.left);
		Node rightNode = root.right;
		if (newHead == null) {
			newHead = root;
			root.left = null;
			prev = root;
		} else {
			prev.right = root;
			root.left = null;
			prev = root;
		}
		processBST(rightNode);
	}

	public void traverse(Node root) {
		if (root == null)
			return;
		System.out.print(root.val + " ");
		traverse(root.right);
	}

}
