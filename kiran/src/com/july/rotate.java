package com.july;
import java.util.*;
public class rotate {
	
	public static void r_clock(int [] arr) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50,60};
		for(int i=1; i<=7;i++) {
			r_clock(arr);
		}
		System.out.println(Arrays.toString(arr));
	}

}
