 package com.novdecnew;

import java.util.Arrays;

public class class16 {
	
	public static void add_ele(int [] arr,int ind) {
		int [] res = new int [arr.length - 1];
		for(int i=0; i<ind; i++) {
			res[i] = arr[i];
		}
		for(int i=ind+1; i<arr.length; i++) {
			res[i-1] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,5,7,9,11};
		int ind = 3;
		add_ele(arr,ind);
		
	}

}
