package com.dll;

class Node{
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class DLL{
	Node head;
	Node tail;
	
	public void print() { //L ---> R
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public void print_rev() {
		Node curr = tail;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.prev;
		}
		System.out.println();
	}
	
	public void add_last(int ele) { //66
		Node temp = new Node(ele);
		if(tail == null) {// LL is empty	
			head = temp;
			tail = temp;
		}
		else {
			temp.prev = tail;
			tail.next = temp;
			tail = temp;  // tail = tail.next;
		}
	}
	
	public void add_first(int ele) {
		Node temp = new Node(ele);
		if(tail == null) {// LL is empty	
			head = temp;
			tail = temp;
		}
		else {
			temp.next = head;
			head.prev = temp;
			head = temp; // head = head.prev;
		}
	}
	
	public void delete_first() {
		if(head == null) {
			System.out.println("ll is already empty");
			return;
		}
		if(head.next == null) {
			head = null;
			tail = null;
		}
		else {
			head = head.next;
			head.prev = null;
		}
	}
	
	public int size() {
		int count = 0;
		Node curr = head;
		while(curr != null) {
			curr = curr.next;
			count++;
		}
		return count;
	}
	
	public void add_at_index(int index, int ele) {
		if(index < 0 || index > size()) {
			System.out.println("inv index");
			return;
		}
		if(index == 0) {
			add_first(ele);
		}
		else if(index == size()) {
			add_last(ele);
		}
		else {
			Node curr = head;
			Node temp = new Node(ele);
			for(int i=0; i<index-1; i++) {
				curr = curr.next;
			}
			temp.next = curr.next;
			temp.prev = curr;
			curr.next.prev = temp;
			curr.next = temp;
		}
		
	}
	
}

public class first {
	
	public static void main(String[] args) {
		
		DLL dll = new DLL();
		dll.add_last(10);
		dll.add_last(20);
		dll.add_last(30);
		dll.add_last(40);
		dll.print();
		dll.add_at_index(1, 99);
		dll.print();
		dll.print_rev();
		

	}

}
