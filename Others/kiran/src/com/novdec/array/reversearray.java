package com.novdec.array;
import java.util.*;

public class reversearray {
	
	public static void reverse(int[] arr) {
		int l =0;
		int h = arr.length-1;
		while(l<h) {
			int temp=arr[l];
			arr[l]=arr[h];
			arr[h]=temp;
			l++;
			h--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,23,34,45,56,67,78};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

}
