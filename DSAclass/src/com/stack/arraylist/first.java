package com.stack.arraylist;

import java.util.ArrayList;

class mystack{
	
	ArrayList<Integer> stack;
	
	public mystack() {
		stack = new ArrayList<>();
	}
	
	void push(int ele) {
		stack.add(ele);
	}
	
	Integer pop() {
		if(stack.size() == 0) {
			System.out.println("stack is empty");
			return null;
		}
		int ele = stack.remove(stack.size()-1);
		return ele;
	}
	
	int peek() {
		return stack.get(stack.size()-1);
	}
	
	boolean isEmpty() {
		return stack.size() == 0;
	}
}

public class first {

	public static void main(String[] args) {
		mystack s = new mystack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop());
		System.out.println(s.peek());
		

	}

}
