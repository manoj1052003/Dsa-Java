package com.novdecnew;

import java.util.Arrays;

public class class25 {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<s.length(); j++) {
				System.out.println(s.substring(i, j+1));
			}
		}
		
		
	}

}
