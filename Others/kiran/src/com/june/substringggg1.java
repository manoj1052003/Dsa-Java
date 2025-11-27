package com.june;

public class substringggg1 {
	
	public static String reverse(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			res = s.charAt(i) + res;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdcbba";
		int longest = 0;
		String lon_str = "";
		for(int i=0; i<s.length(); i++) {
			String res = "";
			for(int j=i; j<s.length(); j++) {
				res = res + s.charAt(j);
				String rev = reverse(res);
				if(res.equals(rev)) {
					if(res.length()>longest) {
						lon_str = res;
						longest = res.length();
					}
					
				}
				
				//System.out.println(s.substring(i, j+1));
			}
		}
		System.out.println(lon_str);
		
	}

}
