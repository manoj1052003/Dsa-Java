package com.novdec.string;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="penTAGon";
		String res  = "";
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c>=65 && c<=90) {
				res = res + (char)(c+32);
			}
			else {
				res = res + (char)(c-32);
			}
		}
		System.out.println(res);
	}

}
