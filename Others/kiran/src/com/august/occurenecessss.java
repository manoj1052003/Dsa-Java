package com.august;
import java.util.*;
public class occurenecessss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aman";
		int [] arr = new int [128];
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			arr[c] = arr[c] + 1;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				System.out.println((char)i+"--->"+arr[i]);
			}
		}
		
		
	}

}
