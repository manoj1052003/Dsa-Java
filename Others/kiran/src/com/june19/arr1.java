package com.june19;

import java.util.*;

public class arr1 {
	
	public static boolean check_bal(char [] arr) {
		int top = -1;
		char s [] = new char[arr.length];
		for(char c : arr) {
			if(c=='(' || c=='{' || c=='[') {
				top++;
				s[top] = c;
			}
			
			if(c==')' && s[top]=='(') {
				top--;
			}
			if(c=='}' && s[top]=='{') {
				top--;
			}
			if(c==']' && s[top]=='[') {
				top--;
			}
		}
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{}[]()";
		char [] arr = s.toCharArray();
		boolean res = check_bal(arr);
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
