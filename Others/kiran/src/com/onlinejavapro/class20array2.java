package com.onlinejavapro;
import java.util.*;
public class class20array2 {
	
	public static void reverse(int [] arr) {
		int [] res = new int[arr.length];
		int p = arr.length-1;
		for(int i=0; i<arr.length; i++) {
			res[p] = arr[i];
			p--;
		}
		System.out.println(Arrays.toString(res));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50,60};
		reverse(arr);
		
	}

}
