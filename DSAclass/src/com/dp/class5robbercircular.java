package com.dp;

public class class5robbercircular {
	
	public static int find_res(int [] arr, int ind) {
		if(ind == 0) {
			return arr[ind];
		}
		if(ind < 0) {
			return 0;
		}
		int pick = arr[ind] + find_res(arr,ind-2);
		int n_pick = find_res(arr,ind-1);
		
		return Math.max(pick, n_pick);
	}
	
	public static void robbstreet(int [] arr) {
		int [] arr1 = new int [arr.length-1];
		int [] arr2 = new int [arr.length-1];
		
		for(int i=0; i<arr.length ;i++) {
			if(i!=0) {
				arr1[i-1] = arr[i]; 
			}
			if(i!=arr.length-1) {
				arr2[i] = arr[i];
			}
		}
		int ans = Math.max(find_res(arr1, arr1.length-1), find_res(arr2, arr2.length-1));
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,1,2,6};
		robbstreet(arr);
		

	}

}
