package com.stack.ll;


class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class stack{
	Node top ;
	
	public void push(int ele) {
		Node newnode = new Node(ele);
		newnode.next = top;
		top = newnode;
	}
	
	public int pop() {
		
		if(top == null) {
			System.out.println("stack is empty");
			return -1;
		}
		int poped = top.data;
		top = top.next;
		return poped;
	}
	
	public int peek() {
		if(top == null) {
			System.out.println("stack is empty");
			return -1;
		}
		return top.data;
	}
}

public class First {

	public static void main(String[] args) {
		stack s = new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());

	}

}
