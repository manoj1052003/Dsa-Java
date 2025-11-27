package com.list;
import java.util.*;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,30,20,20};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int j =0;
		for (int i=0; i<arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		
		for (int i=0; i<=j; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
