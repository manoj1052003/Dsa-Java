package com.sepnov;
import java.util.*;
public class class23 {
	
	public static String reverse(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			res = s.charAt(i) + res;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aemalayalameee";
		int max_len = 0;
		String lon_str = "";
		for(int i=0; i<s.length(); i++) {
			String res = "";
			for(int j=i; j<s.length(); j++) {
				res = res + s.charAt(j);
				//System.out.println(res);
				String res1 = reverse(res);
				if(res.equals(res1)) {
					if(res.length() > max_len) {
						lon_str = res;
						max_len = res.length();
					}
					
				}
				
			}
		}
		System.out.println(lon_str);
	}

}
