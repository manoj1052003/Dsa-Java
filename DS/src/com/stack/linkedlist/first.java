package com.stack.linkedlist;


class Node{
	Node next;
	int data;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class stack{
	Node top;
	
	stack(){
		this.top = null;
	}
	
	void push(int ele) {
		Node temp = new Node(ele);
		if(top == null) {
			top = temp;
		}
		else {
			temp.next = top;
			top = temp;
		}
		
	}
	
	Integer pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return null;
		}
		int val = top.data;
		top = top.next;
		return val;	
	}
	
	boolean isEmpty() {
		return top == null;
	}
	
	Integer peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return null;
		}
		return top.data;
	}
}

public class first {

	public static void main(String[] args) {
		stack s = new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());

	}

}
