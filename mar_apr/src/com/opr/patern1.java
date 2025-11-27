package com.opr;

import java.util.HashMap;

public class patern1 {
	
	public static void soln(int [] arr, int sum) {
		
		HashMap<Integer, Integer> mp = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			int val = arr[i];
			int target = sum - val;
			
			if(mp.containsKey(target)) {
				System.out.println(mp.get(target)+" "+i);
				return;
			}
			mp.put(val, i);
		}
		System.out.println(-1+" "+-1);
	}

	public static void main(String[] args) {
		int [] arr = {1,5,3,7,9,2};
		soln(arr, 4);
		

	}

}
