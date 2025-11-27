package com.june;
import java.util.*;
public class array2 {
	
	public static void rotate_anticlock(int [] arr) {
		int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
	}
	
	
	public static void rotate_clock(int [] arr) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-2; i>=0 ; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,23,34,45,56,67,78};
		for(int i=1; i<=7000%arr.length; i++) {
			rotate_clock(arr);
		}
		System.out.println(Arrays.toString(arr));
	}

}
