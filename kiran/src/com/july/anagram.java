package com.july;
import java.util.*;
public class anagram {
	
	public static boolean check_anagram(char [] arr1, char[] arr2) {
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "silent";
		//convert string to char array
		
		char [] arr1 = new char [s1.length()];
		char [] arr2 = new char [s2.length()];
		
		for(int i=0; i<s1.length(); i++) {
			arr1[i] = s1.charAt(i);
		}
		
		for(int i=0; i<s2.length(); i++) {
			arr2[i] = s2.charAt(i);
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println("after sorting");
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		if(check_anagram(arr1,arr2)) {
			System.out.println("its anagram");
		}
		else {
			System.out.println("its not");
		}
		
		
	}

}
