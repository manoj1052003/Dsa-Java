package com.backup;
import java.util.*;

public class day14 {
	
	public static void rotate_anti(int[] arr) {
		int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,23,34,45,56,67};
		System.out.println(Arrays.toString(arr));
		for(int i=1; i<=3001%arr.length; i++) {
			rotate_anti(arr);
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
