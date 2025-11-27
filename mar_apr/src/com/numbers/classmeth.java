package com.numbers;

import java.util.Arrays;

public class classmeth {
	
	public static void rev(int [] res) {
		int i = 0;
		int j = res.length-1;
		while(i < j) {
			int temp = res[i];
			res[i] = res[j];
			res[j] = temp;
			i++;
			j--;
		}
		
	}
	
	public static void main(String[] args) {
		int [] arr = {12,23,34,45,56,67,78,89};
		rev(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
