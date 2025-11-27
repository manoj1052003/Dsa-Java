package com.novdec.array;

import java.util.Arrays;

public class rotatearray {
	
	public static void rotate(int[] arr) {
		
		int temp = arr[0];
		
		for (int i=1; i<arr.length; i++) {
			arr[i-1]=arr[i];	
		}
		arr[arr.length-1]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,23,34,45,56};
		int n =3;
		for (int i=0; i<n;i++) {
			rotate(arr);
			System.out.println(Arrays.toString(arr));
		}
		
		
	}

}
