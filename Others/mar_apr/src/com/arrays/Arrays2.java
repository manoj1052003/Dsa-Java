package com.arrays;

import java.util.Arrays;

public class Arrays2 {

	public static void main(String[] args) {
		int [] arr = {11,22,33,44,55,66};
		int i = 0;
		int j = arr.length-1;
		System.out.println(Arrays.toString(arr));
		
		while(i<=j) {
			int temp = arr[i]; //22
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println("after rev");
		System.out.println(Arrays.toString(arr));
	}

}
