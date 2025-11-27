package com.sll;


class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class SLL{
	
	Node head;
	
	public void add_last(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
		}
		else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}
	}
	
	public void delete_last() {
		Node curr = head;
		if(head == null) {
			System.out.println("ll is already empty ");
			return;
		}
		if(head.next == null) {
			head = null;
			return;
		}
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
	}
	
	public void add_first(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	
	public void delete_first() {
		if(head == null) {
			System.out.println("ll is already empty");
			return;
		}
		head = head.next;
		
	}
	
	public void add_at_index(int index, int data) {
		if(index < 0 || index > size()) {
			System.out.println("inv index");
		}
		else if(index == 0) {
			add_first(data);
		}
		else if(index == size()) {
			add_last(data);
		}
		else {
			Node temp = new Node(data);
			Node curr = head;
			for(int i=0; i<index-1; i++) {
				curr = curr.next;
			}
			temp.next = curr.next;
			curr.next = temp;
		}
	}
	
	public void delete_at_index(int index) {
		if(index < 0 || index > size()-1) {
			System.out.println("inv index");
		}
		else if(index == 0) {
			delete_first();
		}
		else if(index == size()-1) {
			delete_last();
		}
		else {
			Node curr = head;
			for(int i=0; i<index-1; i++) {
				curr = curr.next;
			}
			curr.next = curr.next.next;
		}
	}
	
	public void add_after(int ele, int data) {
		Node curr = head;
		boolean present = false;  
		Node temp = new Node(data);
		while(curr!= null) {
			if(curr.data == ele) {
				present = true;
			}
			curr = curr.next;
		}
		curr = head;
		if(present) {
			while(curr.data != ele) {
				curr = curr.next;
			}
			temp.next = curr.next;
			curr.next = temp;
		}
		else {
			add_last(data);
		}	
	}
	
	
	public void add_before(int ele, int data) {
		boolean present = false;  
		Node temp = new Node(data);
		Node curr = head;
		while(curr!= null) {
			if(curr.data == ele) {
				present = true;
			}
			curr = curr.next;
		}
		curr = head;
		if(present) {
			if(head.data == ele) {
				add_first(data);
				return;
			}
			
			while(curr.next.data != ele) {
				curr = curr.next;
			}
			temp.next = curr.next;
			curr.next = temp;
		}
		else {
			add_last(data);
		}	
	}
	
	public void print() {
		Node curr = head;
		while(curr!= null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public int size() {
		int count = 0;
		Node curr = head;
		while(curr!= null) {
			count++;
			curr = curr.next;
		}
		return count;
	}
}

public class First {

	public static void main(String[] args) {
		SLL sll = new SLL();
		sll.add_last(10);
		sll.add_last(20);
		sll.add_last(30);
		sll.add_last(40);
		sll.add_last(50);
		sll.print();
		sll.add_after(200, 25);
		sll.print();
		sll.add_before(20, 15);
		sll.print();
		sll.add_before(100, 99);
		sll.print();
		sll.add_before(10, 88);
		sll.print();
		
		
		
		

	}

}
