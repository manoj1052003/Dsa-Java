package com.backup;
import java.util.*;
public class day15 {
	
	public static void b_sort(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {89,78,34,99,33,1,4,8};
		b_sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
