package com.onlinejavapro;

public class class21array3 {
	
	public static int b_search(int [] arr, int key) {
		int left = 0;
		int right = arr.length-1;
		//     6 < = 5
		while(left <= right) {
			int mid = (left+right)/2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(key > arr[mid]) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,6,12,24,33,35,80,90};
		int key = 50;
		int ind = b_search(arr, key);
		System.out.println(ind);
		
	}

}
