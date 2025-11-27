package com.onlinejavapro;

import java.util.Arrays;

public class class27String4 {
	
	public static String lowercase(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);  
			if(c >=65 && c<=90) {
				int nascii = c + 32;   
				char nc = (char)nascii;
				res = res + nc;
			}
			else {
				res = res + c;
			}
		}
		return res;
	}
	
	public static char [] chararray(String s) {
		char [] arr = new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		return arr;
	}
	
	public static void sorting(char[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static boolean check_same(char[] arr1, char [] arr2) {
		if(arr1.length!=arr2.length) {
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
		String a = "LIsten";
		String b = "silENt";
		
		String s1 = lowercase(a);
		String s2 = lowercase(b);

		char [] arr1 = chararray(s1);
		char [] arr2 = chararray(s2);
		
		sorting(arr1);
		sorting(arr2);
		
		if(check_same(arr1, arr2)) {
			System.out.println("its Anagram");
		}
		else {
			System.out.println("its not");
		}
	}

}
