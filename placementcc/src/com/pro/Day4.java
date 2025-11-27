package com.pro;

public class Day4 {
	
	public static String rev(String s) {
		String res = "";
		for(int i=s.length()-1; i>=0; i--) {
			res = res + s.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "hello";
		String l_str = ""; //ll
		for(int i=0; i<s.length();i++) {
			for(int j=i;j<s.length(); j++) {
				String temp = s.substring(i, j+1);
				String res = rev(temp);
				if(temp.equals(res)) {
					if(res.length()>l_str.length()) {
						l_str = res;
					}
				}
			}
		}
		System.out.println(l_str);
		
	}

}
