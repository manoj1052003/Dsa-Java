package com.novdecnew;

import java.util.Arrays;
import java.util.Scanner;

public class class21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pentagon";
		char [] arr = new char[s.length()];
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
	}

}
