package com.twopointer;

import java.util.HashMap;

public class twosum1 {
	
	public static String two_sum(int [] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int n = target - arr[i];
			if(map.containsKey(n)) {
				return "YES";
			}
			map.put(arr[i], i);
			System.out.println(map);
		}
		return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {52,23,64,45,56,39};
		int target = 87;
		System.out.println(two_sum(arr,target));
		
	}

}
