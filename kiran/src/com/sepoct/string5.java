package com.sepoct;

public class string5 {
	
	public static void c_upper(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			if(i==0 || i==s.length()-1) {
				char ch = s.charAt(i);
				char nch = (char)(ch - 32);
				res = res + nch;	
			}
			else {
				char ch = s.charAt(i);
				res = res + ch;
			}
		}
		System.out.print(res+" ");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,23,3,445,56,67};
		for(int val: arr) {
			System.out.println(val);
		}
	}

}
