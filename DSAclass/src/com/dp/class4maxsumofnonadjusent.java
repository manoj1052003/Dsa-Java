package com.dp;

import java.util.Arrays;

public class class4maxsumofnonadjusent {
	
	// brute force approach
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
	
	//memoization
	public static int find_res1(int [] arr, int ind, int [] dp) {
		if(ind == 0) {
			return arr[ind];
		}
		if(ind < 0) {
			return 0;
		}
		
		if(dp[ind] != -1) {
			return dp[ind];
		}
		
		int pick = arr[ind] + find_res1(arr,ind-2,dp);
		int n_pick = find_res1(arr,ind-1,dp);
		
		dp[ind] =  Math.max(pick, n_pick);
		return dp[ind];
	}
	
	//tabulation
	public static int find_res2(int [] arr, int ind, int [] dp) {
		dp[0] = 0;
		if(ind == 0) {
			return arr[ind];
		}
		
		
		for(int i=1; i<=ind; i++) {
			if(ind-i>=0) {
				int pick = arr[i] + find_res2(arr,i-2,dp);
				int n_pick = find_res2(arr,i-1,dp);
				
				dp[ind] = Math.max(pick, n_pick);
			}
		}
		return dp[ind];
	}
	
	//space iptimization
	public static int max_sum(int [] arr, int ind, int [] dp) {
		int prev2 = arr[0];
		int prev1 = Math.max(arr[0], arr[1]);
		int curr = 0;
		for(int i=2; i<=ind; i++) {
			int pick = arr[i] + prev2;
			int n_pick = 0 + prev1;
			curr = Math.max(pick, n_pick);
			prev2 = prev1;
			prev1 = curr;
		}
		return curr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,1,4,9};
		int ind = arr.length-1;
		int [] memo = new int[arr.length];
		Arrays.fill(memo, -1);
		int res = find_res2(arr,ind, memo);
		System.out.println(res);
		
	}

}
