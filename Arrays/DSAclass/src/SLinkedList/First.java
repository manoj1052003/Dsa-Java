package SLinkedList;
//circular linkedlist
class Node {
	Node next;
	int data;

	public Node(int ele) {
		this.data = ele;
		this.next = null;
	}
}

class LL {
	Node head;

	public void print_LL() {
		if (head == null) {
			System.out.println("LL is empty");
		} else {
			Node curr = head;
			do {
				System.out.println(curr.data);
				curr = curr.next;
			} while (curr != head);
		}
	}
	
	public void add_last(int ele) {
		Node temp = new Node(ele);
		if(head == null) {
			head = temp;
			head.next = head;
		}
		else {
			Node curr = head;
			while(curr.next!=head) {
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
			head.next = head;
		}
		else {
			Node curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			temp.next = head;
			head = temp;
			curr.next = head;
		}
	}
	
	public void delete_first() {
		if(head == null) {
			System.out.println("ll is empty");
			return ;
		}
		if(head.next == head) {
			head = null;
		}
		else {
			Node curr = head;
			while(curr.next!=head) {
				curr = curr.next;
			}
			head = head.next;
			curr.next = head;		
		}
	}
	
	public void delete_last() {
		if(head == null) {
			System.out.println("ll is empty");
			return ;
		}
		if(head.next == head) {
			head = null;
		}
		else {
			Node curr = head;
			while(curr.next.next != head) {
				curr = curr.next;
			}
			// Node toDelete = curr.next;
			
			curr.next = head;
		}
	}
	
	public int size() {
		int count = 1;
		if(head == null) {
			return 0;
		}
		else {
			Node curr = head;
			while(curr.next != head) {
				count++;
				curr = curr.next;
			}
		}
		return count;
	}
	
	public void add_at_index(int index, int ele) {
		if(index < 0 || index > size()) {  // Check if the index is out of range
	        System.out.println("Index out of range");
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
			curr.next = temp;
		}
	}

}

public class First {

	public static void main(String[] args) {

		LL ll = new LL();

		ll.head = new Node(10);
		ll.head.next = new Node(20);
		ll.head.next.next = new Node(30);
		ll.head.next.next.next = new Node(40);
		ll.head.next.next.next.next = ll.head;
		ll.print_LL();

	}

}
