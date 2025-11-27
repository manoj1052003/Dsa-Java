package com.novdecnew;

import java.util.Arrays;

public class class17 {
	
	public static void reverse(int [] arr) {
		int [] res = new int [arr.length];
		int k = 0;
		for(int i = arr.length-1;i>=0; i--) {
			res[k] = arr[i];
			k++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
	}
	
	
	public static void avg(int [] arr) {
		float sum = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				count++;
				sum = arr[i] + sum;
			}
			
		}
		System.out.println(sum/count);
	}
	
	
	
	
	
	
	public static void rotate_antic(int [] arr) {
		
		int [] res = new int [arr.length];
		for(int i=1; i<arr.length; i++) {
			res[i-1] = arr[i];
		}
		res[arr.length-1] = arr[0];
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,23,34,45,56,67,78};
		rotate_antic(arr);
		
	}

}
