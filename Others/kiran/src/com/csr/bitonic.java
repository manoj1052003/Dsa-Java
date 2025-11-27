package com.csr;

public class bitonic {
	
static int searchbinary(int[] arr, int key) {
		
		int low= 0;
		int high= arr.length-1;
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			if (key == arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		System.out.println("element not found");
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,23,34,45,56,65,54};
		int key = 65;
		
	}

}
