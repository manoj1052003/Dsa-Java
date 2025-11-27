package com.queue;


class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class QueueLL {
	
	Node head;
	Node tail;
	
	public void enque(int data) {
		Node temp = new Node(data);
		if(tail == null) {//head == null
			head = tail = temp;
		}
		else {
			tail.next = temp;
			tail = temp;
		}
	}
	
	public void deque() {
		if(head == null) {
			System.out.println("queue underflow exc");
		}
		else if(head == tail) {
			head = tail = null;
		}
		else {
			head = head.next;
		}
	}
	
	public int peek() {
		if(head == null) {
			System.out.println("queue underflow exc");
			return -1;
		}
		else {
			int val = head.data;
			return val;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public static void main(String[] args) {
		QueueLL q = new QueueLL();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		System.out.println(q.peek());
		q.deque();
		q.deque();
		q.deque();
		System.out.println(q.peek());
	}

}
