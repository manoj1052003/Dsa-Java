package com.queue;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class QueueLL {
	Node front; // head
	Node rear; // tail
	
	public void enqueue(int ele) {
		Node temp = new Node(ele);
		if(rear == null) {
			front = rear = temp;
		}
		else {
			rear.next = temp;
			rear = temp;
		}
	}
	
	public int dequeue() {
		if(front == null) {
			System.out.println("its already empty");
			return -1;
		}
		int data = front.data;
		front = front.next;
		if(front == null) {//only 1 ele
			rear = null;
		}
		return data;
	}
	
	public int  peek() {
		if(front == null) {
			System.out.println("its already empty");
			return -1;
		}
		int data = front.data;
		return data;
	}
	
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		QueueLL q = new QueueLL();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}

}
