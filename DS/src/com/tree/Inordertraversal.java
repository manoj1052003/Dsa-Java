package com.tree;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}

public class Inordertraversal {
	
	public static void inorder(Node root) {  // root 1000
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data+" ");
		inorder(root.right);
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		root.right.right = new Node(60);
		
		inorder(root);

	}

}
