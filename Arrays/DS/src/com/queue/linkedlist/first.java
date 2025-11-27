package com.queue.linkedlist;

class Node{
	Node next;
	int data;
	
	Node(int data){
		this.data = data;
	}
}

class myqueue{
	Node front;
	Node rear;
	
	public void enqueue(int ele) {
		Node temp = new Node(ele);
		
		if(rear == null) {
			front = temp;
			rear = temp;
		}
		else {
			rear.next = temp;
			rear = rear.next;
		}
	}
	
	public int dequeue() {
		if(front == null) {
			System.out.println("ll is already empty");
			return -1;
		}
		int val = front.data;
		front = front.next;
		return val;
	}
	
	public int peek() {
		if(front == null) {
			System.out.println("ll is already empty");
			return -1;
		}
		else {
			return front.data;
		}
	}
	
	public boolean isEmpty() {
		return rear == null;
	}
	
	public void display() {
		if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
		Node curr = front;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
}
public class first {

	public static void main(String[] args) {
		myqueue q = new myqueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.display();
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		
	}

}
