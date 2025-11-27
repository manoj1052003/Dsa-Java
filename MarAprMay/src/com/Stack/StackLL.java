package com.Stack;


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
	
	public void push(int ele) {//add_first  o(1)
		Node temp = new Node(ele);
		temp.next = top;
		top = temp;
	}
	
	public int pop() {  //delete_first    o(1)
		if(top == null) {
			System.out.println("stack underflow");
			return -1;
		}
		
		int top_ele = top.data;
		top = top.next;
		return top_ele;
	}
	
	

	public static void main(String[] args) {
		StackLL st = new StackLL();
		st.push(10);
		System.out.println(st.pop());
		System.out.println(st.pop());
	}

}
