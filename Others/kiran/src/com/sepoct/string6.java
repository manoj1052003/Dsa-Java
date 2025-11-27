package com.sepoct;
import java.util.*;
public class string6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pentagonspace";
		int [] arr = new int [130];
		//System.out.println(Arrays.toString(arr));
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i); // ch = 'm'
			arr[ch] += 1;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==2) {
				System.out.println((char)i);
			}
		}
		
	}

}
