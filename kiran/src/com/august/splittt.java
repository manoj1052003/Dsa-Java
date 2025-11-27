package com.august;
import java.util.*;
public class splittt {
	
	public static String reverse(String s) {
		String res = "";
		for(int i=s.length()-1;i>=0; i--) {
			res = res + s.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABDEF";
		String res = "";
		for(int i=s.length()-1; i>=0; i--) {
			res = res + (char)(s.charAt(i)+1);
		}
		System.out.println(res);
		
	}

}
