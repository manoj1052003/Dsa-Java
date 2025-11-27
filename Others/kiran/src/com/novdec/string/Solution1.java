package com.novdec.string;

class Solution1 {
    public int solution1(int[] A) {
        int N = A.length;

        if (N < 2) {
            return 0; // Not enough elements for even one tile
        }

        // Calculate pair sums
        int[] pairSum = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            pairSum[i] = A[i] + A[i + 1];
        }

        // Arrays to store the maximum sums with 1, 2, or 3 tiles
        int[] max1Tile = new int[N - 1];
        int[] max2Tiles = new int[N - 1];
        int[] max3Tiles = new int[N - 1];

        // Initialize the first tile placement
        max1Tile[0] = pairSum[0];
        for (int i = 1; i < N - 1; i++) {
            max1Tile[i] = Math.max(max1Tile[i - 1], pairSum[i]);
        }

        // Calculate max sums for 2 tiles
        for (int i = 2; i < N - 1; i++) {
            max2Tiles[i] = Math.max(max2Tiles[i - 1], pairSum[i] + max1Tile[i - 2]);
        }

        // Calculate max sums for 3 tiles
        for (int i = 4; i < N - 1; i++) {
            max3Tiles[i] = Math.max(max3Tiles[i - 1], pairSum[i] + max2Tiles[i - 2]);
        }

        // The result is the maximum value in max3Tiles
        int result = 0;
        if (N - 1 >= 3) {
            result = Math.max(result, max3Tiles[N - 2]);
        }
        if (N - 1 >= 2) {
            result = Math.max(result, max2Tiles[N - 2]);
        }
        if (N - 1 >= 1) {
            result = Math.max(result, max1Tile[N - 2]);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.solution1(new int[]{2, 3, 5, 2, 3, 4, 6, 4, 1})); // Output: 25
        System.out.println(sol.solution1(new int[]{1, 5, 3, 2, 6, 6, 10, 4, 7, 2, 1})); // Output: 35
        System.out.println(sol.solution1(new int[]{1, 2, 3, 3, 2})); // Output: 10
        System.out.println(sol.solution1(new int[]{5, 10, 3})); // Output: 15
    }
}
