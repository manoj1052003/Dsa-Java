package com.Stacklinkedlist;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class MyStack{
	Node head;
	
	public void push(int ele) {
		Node temp = new Node(ele);
		if(head == null) {
			head = temp;
		}
		else {
			temp.next = head;
			head = temp;
		}
	}
	
	public int pop() {
		if(head ==null) {
			System.out.println("stack underflow exc");
			return -1;
		}
		int top = head.data;
		head = head.next;
		return top;
	}
	
	public int peek() {
		if(head ==null) {
			System.out.println("stack underflow exc");
			return -1;
		}
		return head.data;
	}
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
}

public class StackLL {

	public static void main(String[] args) {
		 MyStack st = new MyStack();
		 st.push(10);
		 st.push(20);
		 System.out.println(st.peek());
		 System.out.println(st.peek());
		 System.out.println(st.pop());
		 System.out.println(st.peek());
		 System.out.println(st.pop());
		 System.out.println(st.peek());

	}

}
