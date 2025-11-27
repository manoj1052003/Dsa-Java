package com.strings;
import java.util.*;
public class anagramtoday {
	
	public static void sort_array(char[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "silent";
		String s2 = "listen";
		char [] arr1 = s1.toCharArray();
		char [] arr2 = s2.toCharArray();
		sort_array(arr1);
		sort_array(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("its not");
		}
	}

}
