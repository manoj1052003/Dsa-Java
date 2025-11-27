package com.timecom;

import java.util.Arrays;

public class arrayrot {
	
	public static void rot_clock(int [] arr) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = temp;
	}

	public static void main(String[] args) {
		int [] arr = {12,23,34,45,56,67};
		System.out.println(Arrays.toString(arr));
		for(int i=1; i<=10; i++) {
			rot_clock(arr);
			System.out.println(Arrays.toString(arr));
		}
		

	}

}
