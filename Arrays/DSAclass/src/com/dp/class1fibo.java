package com.dp;

import java.util.Arrays;

public class class1fibo {
	
	// using brute force / recursion;
	public static int find_fibo(int num) {
		if(num<=1) {
			return num;
		}
		
		return find_fibo(num-1) + find_fibo(num-2);
	}
	
	// using dp memo
	public static int find_fibo1(int num, int[] dp) {
		if(num<=1) {
			return num;
		}
		if(dp[num]!=-1) {
			return dp[num];
		}
		dp[num] = find_fibo1(num-1, dp) + find_fibo1(num-2, dp);
		return dp[num];
	}
	
	public static void main(String[] args) {
		int num = 5;
		int [] dp = new int [num+1];
		Arrays.fill(dp, -1);
		int res = find_fibo1(num,dp);
		System.out.println(num);
	}

}
