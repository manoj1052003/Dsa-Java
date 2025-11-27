package com.backup;
import java.util.*;

public class day17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malayalam";
		String res  = ""; 
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			res = c + res;
			}
		System.out.println(res);
		if (s.equals(res)) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not");
		}
		}
		
	}


