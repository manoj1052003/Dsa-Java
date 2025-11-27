package com.stack.prog;

import java.util.Stack;


class Node{
	Node next;
	char data;
	
	public Node(char data) {
		this.data = data;
		this.next = null;
	}
}

class mystack{
	Node top;
	
	mystack(){
		this.top = null;
	}
	
	void push(char ele) {
		Node temp = new Node(ele);
		if(top == null) {
			top = temp;
		}
		else {
			temp.next = top;
			top = temp;
		}
		
	}
	
	Character pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return null;
		}
		char val = top.data;
		top = top.next;
		return val;	
	}
	
	boolean isEmpty() {
		return top == null;
	}
	
	Character peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return null;
		}
		return top.data;
	}
}



public class BalanceParanthesis {
	
	
	public static boolean check_bal(String s) {
		
		mystack st = new mystack();
		char arr [] = s.toCharArray();
		for(char c : arr) {
			if(c == '(' || c == '['  || c == '{') {
				st.push(c);
			}
			else if(st.isEmpty()) {
				return false;
			}
			else if( c == ')' && st.peek() == '(' ||
					 c == ']' && st.peek() == '[' ||
					 c == '}' && st.peek() == '{' ) {
				st.pop();
			}
			else {
				return false;
			}
		}
		if(st.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = "}";
		System.out.println(check_bal(s));
		
	}

}
