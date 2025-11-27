package com.dp;
import java.util.*;


public class minpathisingmemor {
	
	public static int min(int a, int b, int c) {
		if(a<b && a<c) {
			return a;
		}
		else if(b<a && b<c) {
			return b;
		}
		else {
			return c;
		}
	}
	
	public static int mincostmemo(int[][] cost, int n,int m, int[][]memo) {
		if(n<0 || m<0) {
			return Integer.MAX_VALUE;
		}
		else if(n==0 && m==0) {
			return cost[m][n];
		}
		if(memo[m][n]!=-1) {
			return memo[m][n];
		}
		return memo[m][n] = cost[m][n] + min(mincostmemo(cost,n-1,m-1,memo),mincostmemo(cost,n-1,m,memo),mincostmemo(cost,n,m-1,memo));
	}
	
	public static int mincost(int[][] cost, int n,int m) {
		int [] [] memo = new int[n+1][m+1];
		for(int[] rows : memo) {
			Arrays.fill(rows,-1);
		}
		//System.out.println(Arrays.deepToString(memo));
		return mincostmemo(cost,n,m,memo);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] cost = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
		System.out.println(mincost(cost, 2, 2));

	}

}
