package com.csll;


class Node{
	
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class Csll{
	Node head;
	
	public void add_last(int ele) {
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
		}
	}
	
	public void add_first(int ele) {
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
	
	public void print() {
		if(head == null) {
			System.out.println("ll is empty");
			return;
		}
		
		Node curr = head;
		do {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		while(curr != head);
		System.out.println();
	}
}

public class first {

	public static void main(String[] args) {
		Csll f = new Csll();
		f.add_last(10);
		f.add_last(20);
		f.add_last(30);
		f.add_last(40);
		f.print();
		f.add_first(5);
		f.print();

	}

}
