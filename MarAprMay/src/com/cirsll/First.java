package com.cirsll;

class Node{
	Node next;
	int data;
	 Node(int data){
		 this.data = data;
		 this.next = null;
	 }
}

class CLL{
	Node head;
	int size;
	
	public void add_last(int data) {
		Node temp = new Node(data);
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
		size++;
		
	}
	
	public void add_first(int data) {
		Node temp = new Node(data);
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
		size++;
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
		while(curr!= head);
		System.out.println();
	}
}

public class First {

	public static void main(String[] args) {
		 CLL cll = new CLL();
		 cll.add_last(10);
		 cll.add_last(20);
		 cll.add_last(30);
		 cll.print();
		 cll.add_first(40);
		 cll.add_first(50);
		 cll.add_last(60);
		 cll.print();
		 System.out.println(cll.size);

	}

}
