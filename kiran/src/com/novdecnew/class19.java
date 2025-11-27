package com.novdecnew;

import java.util.Arrays;

public class class19 {
	
	public static int b_search(int [] arr, int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] ==key) {
				return mid;
			}
			else if(key > arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid -1;
			}
		}
		return -1;
	}
	
	public static void B_sort(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,71,65,22,3,13,6};
		B_sort(arr);
		
	}

}
