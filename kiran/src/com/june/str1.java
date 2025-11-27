package com.june;
import java.util.*;
public class str1 {
	
	public static boolean check_ana(char[] arr1, char[] arr2) {
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "silent";
		String s2 = "listen";
		
		char [] arr1 = s1.toCharArray();
		char [] arr2 = s2.toCharArray();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		if(check_ana(arr1,arr2)) {
			System.out.println("its anagram");
		}
		else {
			System.out.println("its not");
		}
		
		
	}

}
