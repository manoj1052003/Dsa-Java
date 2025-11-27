package com.onlinejavapro;

public class class29String6 {
	
	public static String reverse(String s) {
		String rev = "";
		for(int i=0; i<s.length(); i++) {
			rev = s.charAt(i) + rev;
		}
		return rev;
	}

	public static void main(String[] args) {
		String s = "amalayalamaaaaa";
		String l_str = "";
		int l_str_len = 0;
		for(int i=0; i<s.length(); i++) {
			String res = "";
			for(int j=i; j<s.length();j++) {
				res = res + s.charAt(j);
				String rev = reverse(res);
				if(res.equals(rev)) {
					if(res.length()>l_str_len) {
						l_str = res;
						l_str_len = l_str.length();
					}
				}
			}
		}
		System.out.println(l_str);
	}
}
