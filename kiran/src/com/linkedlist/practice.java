package com.linkedlist;

class Node1{
	int data;
	Node1 next;
	
	Node1(int data){
		this.data = data;
		this.next = null;			
	}
}

class Linked_list1{
	static Node1 head;
	
	void print_ll() {
		Node1 curr = head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
}
	
public class practice {

	public static void main(String[] args) {
		
		Linked_list1 ll = new Linked_list1();
		Node1 p1 = new Node1(10);
		Node1 p2 = new Node1(20);
		Node1 p3 = new Node1(30);
		Node1 p4 = new Node1(40);
		
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		
		Node1 head = p1;
		//print_ll(head);
		ll.head=head;
		ll.print_ll();
	}

}
