package com.novdec.string;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABDEF";
		String res  = "";
		for (int i =0; i<s.length();i++) {
			char c = s.charAt(i);
			res = c + res;	
		}
		for (int i=0; i<res.length();i++) {
			char c = (char)(res.charAt(i)+1);
			System.out.print(c);
		}
	}

}
