package com.zoho;

public class pat3 {
    public static void main(String[] args) {
        int rows = 6; // Number of rows

        int oddNum = 1;
        int evenNum = 2;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print(oddNum + " ");
                    oddNum += 2;
                } else {
                    System.out.print(evenNum + " ");
                    evenNum += 2;
                }
            }
            System.out.println();
        }
    }
}

