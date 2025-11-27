package com.twopointer;
import java.util.*;
public class twosum2 {
	
	public static String two_sum(int [] arr, int target) {
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]==target) {
				return "YES";
			}
			else if(arr[i]+arr[j]>target) {
				j--;
			}
			else {
				i++;
			}
		}
		return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {52,23,64,45,56,39};
		int target = 871;
		System.out.println(two_sum(arr,target));
	}

}
