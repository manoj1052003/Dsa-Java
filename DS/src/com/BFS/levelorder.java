package com.BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		this.right = null;
		this.left = null;
	}
}

public class levelorder {
	
	public static void printbfs(Node root) {
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.data+" ");
			if(curr.left != null) {
				q.add(curr.left);
			}
			if(curr.right!= null) {
				q.add(curr.right);
			}
		}
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		root.right.left.left = new Node(60);
		root.right.right.left = new Node(70);
		root.right.right.right = new Node(80);
		printbfs(root);

	}

}
