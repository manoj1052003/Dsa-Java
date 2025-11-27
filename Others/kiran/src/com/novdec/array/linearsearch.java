package com.novdec.array;

public class linearsearch {
	
	public static int search(int [] arr,int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key>arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {99,87,76,65,54,43,31,21};
		int key = 87;
		int res = search(arr,key);
		System.out.println(res);
		
	}

}
