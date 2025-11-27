package oct9;


class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedList{
	
	Node head;
	
	public void print_ll() {
		if(head == null) {
			System.out.println("ll is empty");
		}
		else {
			Node curr = head;
			while(curr != null) {
				System.out.println(curr.data);
				curr = curr.next;
			}
		}
	}

	
	public void add(int data) {
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
	
}

public class ll {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(99);
		ll.add(91);
		ll.print_ll();
	}	
}

	

