package com.backup;
import java.util.*;

public class day13 {
	
	public static int l_search(int [] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				System.out.print("element found at index ");
				return i;
			}
		}
		System.out.println("element not found");
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,23,134,45,656,67,78};
		int [] res = new int [arr.length];
		int k = arr.length-1;
		for(int i =0; i<arr.length; i++) {
			res[k]=arr[i];
			k--;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
		
		
		
	}
}
