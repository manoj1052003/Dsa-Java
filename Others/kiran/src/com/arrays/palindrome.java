package com.arrays;

public class palindrome {
	
	static boolean check_palindrome(int [] arr) {
		
		int low = 0;
		int high = arr.length-1;
		
		while (low < high) {
			
			if (arr[low]!= arr[high]) {
				
				return false;	
			}
			low+=1;
			high-=1;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,2,1};
		boolean res = check_palindrome(arr);
		System.out.println(res);
		
		

	}

}
