package com.clinkedlist;

class Node {
	Node next;
	int data;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList{
	
	Node head;
	
	void add_last(int ele) {
		Node temp = new Node(ele);
		if(head == null) {
			head = temp;
			temp.next = head;
		}
		else {
			Node curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			temp.next = head;
			curr.next = temp;
		}
	}
	
	void print_LL() {
		
		if(head == null) {
			System.out.println("ll is empty");
			return;
		}
		
		Node curr = head;
		do {
			System.out.println(curr.data);
			curr = curr.next;
		}
		while(curr != head);
	}
	
	
	void add_first(int ele) {
		Node temp = new Node(ele);
		if(head == null) {
			head = temp;
			temp.next = head;
		}
		else {
			Node curr = head;
			
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
			head = temp;
		}
	}
	
	void delete_first(int ele) {
		if(head == null) {
			System.out.println("ll is already null");
			return;
		}
		if(head.next == null) {
			head = null;
		}
		else {
			Node curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = head.next;
			head = head.next;
		}
	}
	
	void delete_last(int ele) {
		
	}
}

public class first {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add_last(10);
		l.add_last(20);
		l.add_last(30);
		l.add_last(40);
		l.print_LL();
	}

}
