package com.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


class Node{
	int data;
	Node left;
	Node right;
	Node(int x){
		this.data = x;
		this.left = null;
		this.right = null;
	}
}
public class First {
	
	public void pre_order(Node root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.data+" ");
		pre_order(root.left);
		pre_order(root.right);	
	}
	
	public void in_order(Node root) {
		if(root == null) {
			return ;
		}
		in_order(root.left);
		System.out.print(root.data+" ");
		in_order(root.right);	
	}
	
	public void post_order(Node root) {
		if(root == null) {
			return ;
		}
		post_order(root.left);
		post_order(root.right);
		System.out.print(root.data+" ");
	}
	
	public void level_order(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		boolean l_r = true;
		while(!q.isEmpty()) {
			ArrayList<Integer> list = new ArrayList<>();
			int size = q.size();
			for(int i=0; i<size; i++) {
				Node first = q.poll();
				//System.out.print(first.data+" ");
				list.add(first.data);
				if(first.left != null) {
					q.add(first.left);
				}
				if(first.right != null) {
					q.add(first.right);
				}
			}
			if(l_r == false) {
				Collections.reverse(list);
			}
			
			for(int val : list) {
				System.out.print(val +" ");
			}
			if(l_r == true) {
				l_r = false;
			}
			else {
				l_r = true;
			}
			System.out.println();
		}
	
	}
	

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(80);
		root.right.right = new Node(90);
		root.left.left = new Node(40);
		root.left.left.left = new Node(60);
		root.left.left.right = new Node(70);
		root.left.right = new Node(50);
		First f = new First();
		f.level_order(root);
		
	}

}  
