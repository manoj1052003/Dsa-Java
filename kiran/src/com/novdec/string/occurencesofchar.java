package com.novdec.string;

import java.util.Arrays;

public class occurencesofchar {
	    public static void main(String[] args) {
	        String input = "Example string with various CHARACTERS 12345!";

	        // Count character occurrences
	        int[] counts = countCharacterOccurrences(input);

	        // Print results
	        for (int i = 0; i < counts.length; i++) {
	            if (counts[i] > 0) {
	                System.out.println((char) i + ": " + counts[i]);
	            }
	        }
	    }

	    private static int[] countCharacterOccurrences(String input) {
	        // Array to store counts of each character (covering basic ASCII)
	        int[] counts = new int[128];

	        // Iterate over each character in the string
	        for (char c : input.toCharArray()) {
	            if (c < 128) { // Ensure the character is within ASCII range
	                counts[c]++;
	            }
	        }

	        return counts;
	    }
	}

