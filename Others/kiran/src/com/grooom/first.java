package com.grooom;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next =null;
	}
}

class LinkedList{
	
	
	void print_ll(Node head) {
		Node curr = head;
		if(head == null) {
			System.out.println("ll is empty");
		}
		else {
			while(curr!=null) {
				System.out.println(curr.data);
				curr = curr.next;
			}
			
		}
	}
}

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node p1 = new Node(10);
		Node p2 = new Node(20);
		Node p3 = new Node(30);
		Node p4 = new Node(40);
		Node p5 = new Node(50);
		
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		p4.next = p5;
		
		Node head = p1;
		LinkedList ll = new LinkedList();
		ll.print_ll(head);
	}

}
