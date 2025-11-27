package com.backup;

public class day18 {
	public static void upper_case(String s ) {
		String res = "";
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if(c>=65 && c<=90) {
				res = res + (char)(c+32);
			}
			else {
				res = res + c;
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HeLlo";
		upper_case(s);
	}

}
