package com.june;

public class lastsecond {
	public static boolean check_palindrome(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			res = s.charAt(i) + res;
		}
		if(s.equals(res)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malayalam";
		String lon_sub = "";
		int lon = 0;
		for(int i=0; i<s.length(); i++) {
			String res = "";
			for(int j=i; j<s.length(); j++) {
				res = res + s.charAt(j);
				if(check_palindrome(res)) {
					//System.out.println(res);
					if(res.length()>lon) {
						lon = res.length();
						lon_sub = res;
					}
				}
			}
			
		}
		System.out.println(lon_sub);
		
		
	}

}
