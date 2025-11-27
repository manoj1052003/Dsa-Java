package com.june19;

public class substringggg {
	
	public static String reverse(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			res = s.charAt(i) + res;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bamalayalamad";
		String lon_str = "";
		int lon_len = 0;
		for(int i=0; i<s.length(); i++) {
			String res = "";
			for(int j=i; j<s.length(); j++) {
				res = res + s.charAt(j);
				String rev = reverse(res);
				if(res.equals(rev)) {
					if(res.length()>lon_len) {
						lon_str = res;
						lon_len = res.length();
					}
					
				}
				
			}
		}
		System.out.println(lon_str);
	}

}
