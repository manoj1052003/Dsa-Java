package com.linkedlist;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class linkedlist{
	Node head;
	public void print_ll(Node head) {
		Node curr = head;
		
		while(curr!=null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
}
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist ll = new linkedlist();
		Node p1 = new Node(10);
		Node p2 = new Node(20);
		Node p3 = new Node(30);
		Node p4 = new Node(40);
		
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		
		Node head = p1;
		ll.print_ll(p1);

	}

}
