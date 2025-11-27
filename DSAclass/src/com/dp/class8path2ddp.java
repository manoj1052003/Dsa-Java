package com.dp;

import java.util.Arrays;

public class class8path2ddp {
	
	public static int countways_rec(int i, int j) {
		if(i==0 && j==0) {
			return 1;
		}
		if(i<0 || j<0) {
			return 0;
		}
		int up = countways_rec(i-1, j);
		int left = countways_rec(i, j-1);
		
		return left+up;
	}
	
	public static int countways_memo(int i, int j, int [][] dp) {
		if(i==0 && j==0) {
			return 1;
		}
		if(i<0 || j<0) {
			return 0;
		}
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		int up = countways_memo(i-1, j, dp);
		int left = countways_memo(i, j-1, dp);
		
		return dp[i][j] = up + left;
		
	}
	//kiran approach
	public static int countways_tab(int m, int n) {
		int[][] dp = new int[m][n];
		
		dp[0][0] = 1;
		for(int i=0;i<m; i++) {
			for(int j=0; j<n; j++) {
				int up = 0;
				int left = 0;
				if(i-1>=0) {
					up = dp[i-1][j];
				}
				if(j-1>=0) {
					left = dp[i][j-1];
				}
				if(i!=0 || j!=0) {
					dp[i][j] = up + left;
				}
				
			}
		}
		return dp[m-1][n-1];
	}
	
	//geeks for geeks appraoch
	static int numberOfPaths(int m, int n) {

        int dp[][] = new int[m][n];

        // Count of paths to reach any cell in
        // first column is 1
        for (int i = 0; i < m; i++)
            dp[i][0] = 1;

        // Count of paths to reach any cell in
        // first row is 1
        for (int j = 0; j < n; j++)
            dp[0][j] = 1;

        // Calculate count of paths for other
        // cells in bottom-up manner using
        // the recursive solution
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++)

                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
        return dp[m - 1][n - 1];
    }
	
	//striver appraoch
	static int countWaysUtil(int m, int n, int[][] dp) {
        // Loop through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Base condition: If we are at the top-left cell (0, 0), there's one way to reach it.
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                // Calculate the number of ways by moving up (if possible) and left (if possible)
                if (i > 0)
                    up = dp[i - 1][j];
                if (j > 0)
                    left = dp[i][j - 1];

                // Store the total number of ways to reach the current cell in the DP array
                dp[i][j] = up + left;
            }
        }

        // Return the number of ways to reach the bottom-right cell (m-1, n-1)
        return dp[m - 1][n - 1];
    }

    // Function to count the number of ways to reach cell (m, n)
    static int countWays(int m, int n) {
        // Create a 2D DP array to store the results
        int dp[][] = new int[m][n];

        // Initialize the DP array with -1 to indicate uncomputed values
        for (int[] row : dp)
            Arrays.fill(row, -1);

        // Call the countWaysUtil function to calculate and return the result
        return countWaysUtil(m, n, dp);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
        int n = 3;
        System.out.println(countways_tab(m, n));
//        int [][] dp = new int[m][n];
//        for(int [] arr : dp) {
//        	Arrays.fill(arr, -1);
//        }
//        System.out.println(Arrays.deepToString(dp));
//        System.out.println(countways_memo(m-1,n-1,dp));
	}

}
