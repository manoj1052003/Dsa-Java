package com.novdecnew;

import java.util.Arrays;

public class class24 {
	
	public static String lower(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>=65 && ch<=90) {
				char ch1 = (char)(ch + 32);
				//System.out.println(ch1);
				res = res + ch1;
			}
			else {
				
				//System.out.println(ch1);
				res = res + ch;
			}
		}
		return res;
	}
	
	public static char[] con_array(String s) {
		char[] arr = new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		return arr;
	}
	
	public static void sort(char[] arr) {
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
	
	public static boolean com_strings(char [] arr1, char [] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "SILenT";
		
		String ns1 = lower(s1);
		String ns2 = lower(s2);

		
		char [] arr1 = con_array(ns1);
		char [] arr2 = con_array(ns2);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		sort(arr1);
		sort(arr2);
		
		if(com_strings(arr1, arr2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("its not");
		}
	}

}
