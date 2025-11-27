package com.practice;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LL1 {
	
	Node head;
	public void add_LL(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
		}
		else {
			Node curr = head;
			while(curr.next!=null) {
				curr = curr.next;
			}
			curr.next = temp;
		}
	}
	
	public void add_first(int data) {
		Node curr = head;
		Node temp = new Node(data);
		temp.next = curr;
		head = temp;
	}
	
	public void add_at_index(int index, int ele) {
		Node curr = head;
		Node temp = new Node(ele);
		int count = 0;
		while(count<index-1) {
			curr = curr.next;
			count++;
		}
		temp.next = curr.next;
		curr.next = temp;
	}
	
	public void add_last(int ele) {
		Node curr = head;
		Node temp = new Node(ele);
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = temp;
	}
	
	public void add_all(int [] arr) {
		for(int val:arr) {
		    add_last(val);
		}
	}
	
	public void remove_first() {
		Node curr = head;
		if(curr == null) {
			System.out.println("ll is empty");
		}
		else {
			head = curr.next;
		}
	}
	
	public void remove_last() {
		if(head == null) {
			System.out.println("ll is already empty");
		}
		else if(head.next==null) {
			head = null;
		}
		else {
			Node curr = head;
			while(curr.next.next!=null) {
				curr = curr.next;
			}
			curr.next = null;
		}
		
	}
	
	public int index_of(int ele) {
		Node curr = head;
		int count = 0;
		while(curr!=null) {
			if(curr.data == ele) {
				return count;
			}
			else {
				count++;
				curr = curr.next;
			}
		}
		return -1;
	}
	
	public int last_indexof(int ele) {
		int count = 0;
		int ind = -1;
		Node curr = head;
		while(curr!=null) {
			if(curr.data==ele) {
				ind = count;
			}
			count++;
			curr = curr.next; 
		}
		
		return ind;
	}
	
	public void print_LL() {
		Node temp = head;
		if(head == null) {
			System.out.println("ll is empty");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
	public void reverse_ll() {
		Node curr = head;
		Node rev = null;
		
		while(curr != null) {
			Node nextnode = curr.next;
			curr.next = rev;// we are updating the curr.next
			rev = curr;     // so we lost next values 
			curr = nextnode;// before loosing it stote in temp
		}
		while(rev!=null) {
			System.out.println(rev.data);
			rev= rev.next;
		}
	}
	
	
	public int size() {
		Node curr = head;
		int count = 0;
		while(curr!=null) {
			count++;
			curr = curr.next;
		}
		return count;
	}
	
	public void add_after(int val, int newval) {
		if(size() == 0) {
			System.out.println("ll is empty so not added");
			return;
		}
		Node curr = head;
		while(curr!=null) {
			if(curr.data == val) {
				Node temp = new Node(newval);
				temp.next = curr.next;
				curr.next = temp;
				return;
			}
			curr = curr.next;
		}
		System.out.println("val not found in the index");
	}
	
}


public class prac {
	
	public static void main(String[] args) {
		
		LL1 l = new LL1();
		
		l.add_LL(10);
		l.add_LL(30);
		l.add_LL(20);
		l.add_LL(50);
		l.add_first(100);
		l.add_at_index(3, 99);
		l.add_last(999);
		int [] arr = {10,20,30,40};
		l.add_all(arr);
		l.print_LL();
		l.remove_first();
		l.remove_last();
		l.print_LL();
		System.out.println(l.index_of(9999));
		System.out.println(l.last_indexof(9999));

	}

}
