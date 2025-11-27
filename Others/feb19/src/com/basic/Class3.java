package com.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Class3 {

//	public static char[] conv_chararray(String s) {
//		char[] arr = new char[s.length()];
//		for (int i = 0; i < s.length(); i++) {
//			arr[i] = s.charAt(i);
//		}
//		return arr;    
//	}
//
//	public static String conv_lower(String s) {
//		String res = "";
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (ch >= 65 && ch <= 90) {
//				res += ((char)(ch+32));
//			} else {
//				res += (ch);
//			}
//		}
//		return res;
//	}
//	
//	public static void b_sort(char [] arr) {
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length-1; j++) {
//				if(arr[j] > arr[j+1]) {
//					char temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//	}
//	
//	public static boolean comp_arrays(char [] arr1, char [] arr2 ) {
//		if(arr1.length != arr2.length) {
//			return false;
//		}
//		for(int i=0; i<arr1.length; i++) {
//			if(arr1[i] != arr2[i]) {
//				return false;
//			}
//		}
//		return true;
//	}

	public static String rev(String s) {
		String ans = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			ans += s.charAt(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "aamalayalamab";
		String l_str = "";
		int max_len = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String res = "";
				for (int k = i; k <= j; k++) {
					res += s.charAt(k);
				}
				if (res.equals(rev(res))) {
					if(res.length() > max_len) {
						l_str = res;
						max_len = res.length();
					}
					
				}
			}
		}
		System.out.println(l_str);

	}

}
