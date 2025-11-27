package com.pro;

import java.util.Arrays;

public class Day3 {
	
	public static void rot_anti(int [] arr) {
		int temp = arr[0];
		for(int i=1; i<=arr.length-1; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		
	}
	
	
	public static void rot_clock(int [] arr) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = temp;
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		for(int i=1; i<=288%arr.length; i++) {
			rot_anti(arr);
		}
//		for(int i=1; i<=400%arr.length; i++) {
//			rot_clock(arr);
//		}
		System.out.println(Arrays.toString(arr));
	}

}
