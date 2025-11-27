package com.novdec.array;

public class checksorted {
	
	public static boolean is_sorted(int[] arr) {
		for(int i=1; i<arr.length; i++ ) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,43,34,45,56,67};
		if (is_sorted(arr)) {
			System.out.println("yes sorted");
		}
		else {
			System.out.println("its not");
		}

	}

}
