package com.dp;

import java.util.Arrays;

public class class2frogjump {
	
	//brute force approach
	public static int find_res(int [] height, int ind) {
		if(ind == 0) {
			return 0;
		}
		if(ind == 1) {
			return Math.abs(height[0]-height[1]);
		}
		int left = find_res(height,ind-1) + Math.abs(height[ind] - height[ind-1]);
		int right = find_res(height,ind-2) + Math.abs(height[ind] - height[ind - 2]);
		return Math.min(left, right);
	}
	
	//memoization
	public static int find_res1(int [] height, int ind, int [] memo) {
		if(ind == 0) {
			return 0;
		}
		if(ind == 1) {
			return Math.abs(height[0]-height[1]);
		}
		if(memo[ind]!=-1) {
			return memo[ind];
		}
		int left = find_res1(height,ind-1,memo) + Math.abs(height[ind] - height[ind-1]);
		int right = find_res1(height,ind-2,memo) + Math.abs(height[ind] - height[ind - 2]);
		memo[ind] =  Math.min(left, right);
		return memo[ind];
	}
	//tabulation
	public static int find_res2(int [] height) {
		int [] dp = new int [height.length];
		dp[0] = 0;
		dp[1] =Math.abs(height[0]-height[1]);
			
		for(int i=2; i<height.length; i++) {
			dp[i] = Math.min(dp[i-1] + Math.abs(height[i] -height[i-1]), dp[i-2] + Math.abs(height[i] -height[i-2]));
		}
		
		return dp[height.length-1];
	}
	
	//Using Space Optimized DP – O(n) Time and O(1) Space
	public static int find_res3(int [] height) {
		int prev2 = 0;
		int prev1 = Math.abs(height[0] - height[1]);
		int curr=0;
		for(int i=2; i<height.length; i++) {
			curr = Math.min(prev1 + Math.abs(height[i] - height[i-1]), prev2 + Math.abs(height[i] - height[i-2]));
			prev2 = prev1;
			prev1 = curr;
		}
		return curr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {20, 30, 40, 20};
		int [] memo = new int [height.length];
		Arrays.fill(memo, -1);
		System.out.println(find_res3(height));
	}

}
