package com.dp;

import java.util.Arrays;

public class class3withkdistance {
	
	//brute force
	public static int find_res(int [] height, int k, int ind) {
		if(ind == 0) {
			return 0;
		}
		int mmsteps = Integer.MAX_VALUE;
		
		for(int i=1; i<=k ; i++) {
			if(ind-i>=0) {
				int jump = find_res(height,k,ind-i) + Math.abs(height[ind] - height[ind-i]);
				mmsteps = Math.min(mmsteps, jump);
				//System.out.println(mmsteps);
			}
		}
		return mmsteps;

	}
	
	//memoization
	public static int find_res1(int [] height, int k, int ind, int [] memo) {
		if(ind == 0) {
			return 0;
		}
		if(memo[ind] != -1) {
			return memo[ind];
		}
		int mmsteps = Integer.MAX_VALUE;
		
		for(int i=1; i<=k ; i++) {
			if(ind-i>=0) {
				int jump = find_res1(height,k,ind-i,memo) + Math.abs(height[ind] - height[ind-i]);
				mmsteps = Math.min(mmsteps, jump);
				//System.out.println(mmsteps);
			}
		}
		memo[ind] = mmsteps;
		return memo[ind];
	}
	
	//tabulation
	
	public static int find_res2(int [] height, int k, int ind, int [] dp ) {
		dp[0] = 0;
		
		for(int i=1; i<=ind; i++) {
			int mmsteps = Integer.MAX_VALUE;
			for(int j=1; j<=k; j++) {
				if(i-j >= 0) {
					int jumps = dp[i-j] + Math.abs(height[i] - height[i-j]);
					mmsteps = Math.min(mmsteps, jumps);
				}
			}
			dp[i] = mmsteps;
		}
		return dp[ind];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {20, 30, 40, 20};
		int k = 3;
		int ind = height.length-1;//last index
		int [] memo = new int[height.length];
		Arrays.fill(memo, -1);
		System.out.println(find_res2(height, k, ind, memo));
		
	}

}
