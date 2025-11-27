package com.april;
import java.util.*;

public class stringintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(s);
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		char [] arr = s.toCharArray();
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}

}
