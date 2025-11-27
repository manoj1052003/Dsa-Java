package com.strings;
import java.util.Arrays;


public class anagram {
	
	static boolean check_anagram(char [] a1, char [] a2) {
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if (a1.length!=a2.length) {
			return false;
		}
		else {
			for (int i =0; i < a1.length; i++) {
				if (a1[i]!=a2[i]) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "listen";
		String s2 = "silent";

		char [] arr1 = s1.toCharArray();
		char [] arr2 = s2.toCharArray();
		
		boolean res = check_anagram(arr1,arr2);
		System.out.println(res);
	}

}

