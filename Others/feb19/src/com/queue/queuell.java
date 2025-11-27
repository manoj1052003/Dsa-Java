package com.queue;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Queue{
	
	Node front;
	Node rear;
	
	public void enqueue(int data) {
		Node temp = new Node(data);
		if(rear== null) {
			front = rear = temp;
		}
		rear.next = temp;
		rear = rear.next;
		
	}
	public int dequeue() {
		if(rear == null) {
			System.out.println("q is already empty");
			return -1;
		}
		if(front.next == null) {
			int res = front.data;
			front = rear = null;
			return res;
		}
		int res = front.data;
		front = front.next;
		return res;
		
	}
	
	public int peek() {
		if(rear == null) {
			System.out.println("queue is already empty");
			return -1;
		}
		return front.data;
	}
	
	public void print_queue() {
		Node curr = front;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		return front == null;
	}
}

public class queuell {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.print_queue();
		System.out.println(q.dequeue());
		q.print_queue();
		System.out.println(q.peek());
		q.print_queue();

	}

}
