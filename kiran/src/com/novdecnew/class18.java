package com.novdecnew;

import java.util.Arrays;

public class class18 {
	
	public static int l_search(int [] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] ==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50,60};
		int key = 400;
		int ind = l_search(arr,key);
		System.out.println(ind);
		
		
	}

}
