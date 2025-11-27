package com.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class BinaryTree {
	
	
	public static void pre_order(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		pre_order(root.left);
		pre_order(root.right);
	}
	
	public static void in_order(Node root) {
		if(root == null) {
			return;
		}
		in_order(root.left);
		System.out.print(root.data+" ");
		in_order(root.right);
	}
	
	public static void post_order(Node root) {
		if(root == null) {
			return;
		}
		post_order(root.left);
		post_order(root.right);
		System.out.print(root.data+" ");
		
	}
	
	public static void level_order(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=1; i<=size; i++) {
				Node curr = q.poll();
				System.out.print(curr.data+" ");
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
			System.out.println();
		}
	}
	
	public static void zigzag_level_order(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		boolean l_r = true;
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> list = new ArrayList<>();
			for(int i=1; i<=size; i++) {
				Node curr = q.poll();
				//System.out.print(curr.data+" ");
				list.add(curr.data);
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
			if(l_r == false) {
				Collections.reverse(list);
			}
			
//			for(int i=0; i<list.size(); i++) {
//				System.out.print(list.get(i)+" ");
//			}
			System.out.print(list);
			if(l_r==true) {
				l_r = false;
			}
			else {
				l_r = true;
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		root.left.left.left = new Node(7);
		root.left.right.left = new Node(8);
		root.left.right.right = new Node(9);
		root.right.right.right = new Node(10);
		root.left.left.left.left = new Node(11);
		zigzag_level_order(root);

	}

}
