package com.recursion;

public class first {
	
	public static int l_search(int [] arr , int key) {
		int i = 0;
		while(i<arr.length) {
			if(arr[i] == key) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public static int l_searchrec(int i, int [] arr, int key) {
		if(i == arr.length) {
			return -1;
		}
		if(arr[i] == key) {
			return i;
		}
		return l_searchrec(i+1, arr, key);
	}
	
	
	public static void print_num(int num, int count) { //23  49
		if(num == 0) {
			System.out.println(count);
			return;
		}
		
		print_num(num-1,count*num);  // 22 72
		
	}

	public static void main(String[] args) {
		int [] arr = {23,1,4,7,9,18};
		int k = 77;
		int i = 0;
		System.out.println(l_searchrec(i, arr, k));
		
	}

}
