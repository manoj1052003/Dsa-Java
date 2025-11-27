package com.Stack;

public class StackArry {
	
	int [] arr;
	int size;
	int top;
	
	public StackArry(int size) {
		this.size = size;
		this.top = -1;
		arr = new int [size];	
	}
	
	public void push(int ele) {
		if(top == size-1) {
			System.out.println("stack overflow");
			return;
		}
		//top++;
		arr[++top] = ele;
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("stack underflow exc");
			return -1;
		}
		int top_ele = arr[top--];
		//top--;
		return top_ele;
	}
	
	public int peek() {
		if(top == -1) {
			System.out.println("stack underflow exc");
			return -1;
		}
		return arr[top];
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	

	public static void main(String[] args) {
		StackArry st = new StackArry(5);
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.pop());
		st.push(55);
		System.out.println(st.pop());
		System.out.println(st.pop());
		

	}

}
