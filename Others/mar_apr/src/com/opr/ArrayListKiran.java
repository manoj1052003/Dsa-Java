package com.opr;


public class ArrayListKiran {
	
	int [] arr;
	int capacity;
	int size;
	
	public ArrayListKiran() {
		this.capacity = 10;
		arr = new int [capacity];
		this.size = 0;
	}
	
	public void add(int ele) {
		if(size == capacity) {
			grow();
		}
		arr[size] = ele;
		size++;
	}
	
	public void grow() {
		capacity *= 2;
		int [] newarr = new int [capacity];
		for(int i=0; i<size; i++) {
			newarr[i] = arr[i];
		}
		arr = newarr;
	}
	
	public void printList() {
        System.out.print("IntArrayList: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
		ArrayListKiran ak = new ArrayListKiran();
		ak.add(10);
		ak.add(20);
		ak.add(30);
		ak.add(20);
		ak.add(30);
		ak.add(40);
		ak.add(50);
		ak.add(60);
		ak.add(80);
		ak.add(90);
		ak.add(1110);
		ak.printList();

	}

}
