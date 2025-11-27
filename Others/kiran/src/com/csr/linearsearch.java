package com.csr;

public class linearsearch {
	
	public static int b_search(int[] arr, int key) {
		int low =0 ;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key<arr[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr= {100,90,70,50,40,30,20};
		int key = 167; 
		int res = b_search(arr,key);
		System.out.println(res);
	}

}
