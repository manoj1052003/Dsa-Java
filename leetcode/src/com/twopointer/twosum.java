package com.twopointer;

public class twosum {
	
	public static String two_sum(int [] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1 ; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" "+arr[j]);
					return "YES";
				}
			}
		}
		return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,6,7,5,12,23,34,45,56,6888,990,83645};
		int target = 90;
		System.out.println(two_sum(arr,target));
		
		
	}

}
