package com.stackArray;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}


public class StackLL {
	
	Node top;
	
	public void push(int data) {
		Node temp = new Node(data);
		temp.next = top;
		top = temp;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("underflow exc");
			return -1;
		}
		int val = top.data;
		top = top.next;
		return val;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is alr empty");
			return -1;
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void print_stackk() {
		Node curr = top;
		while(curr != null) {
			System.out.print(curr.data+ " ");
			curr = curr.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLL sll = new StackLL();
		sll.push(10);
		sll.push(20);
		System.out.println(sll.peek());
		System.out.println(sll.pop());
		System.out.println(sll.pop());
		System.out.println(sll.peek());
		
		//sll.print_stackk();
		

	}

}
