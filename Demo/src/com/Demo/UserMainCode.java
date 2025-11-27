package com.Demo;

import java.util.*;

public class UserMainCode {
    public int findMinimumSubstrings(int input1, String input2) {
        int bCount = 0;
        int rCount = 0;
        
        // Count distinct blocks of 'B' and 'R'
        for (int i = 0; i < input1; i++) {
            if (i == 0 || input2.charAt(i) != input2.charAt(i - 1)) {
                if (input2.charAt(i) == 'B') {
                    bCount++;
                } else {
                    rCount++;
                }
            }
        }
        
        // If the string is already sorted, only one substring is needed
        if (bCount == 0 || rCount == 0) {
            return 1;
        }
        
        // Total substrings needed to sort = Number of distinct 'B' + 'R' blocks
        return bCount + rCount;
    }
    
    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();
        // Example test cases
        System.out.println(obj.findMinimumSubstrings(6, "BRRBBR")); // Output: 3
        System.out.println(obj.findMinimumSubstrings(4, "RRBB"));   // Output: 2
        System.out.println(obj.findMinimumSubstrings(5, "BBBBB"));  // Output: 1
        System.out.println(obj.findMinimumSubstrings(7, "RBBRRBB")); // Output: 4
    }
}