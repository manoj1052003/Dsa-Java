package com.backup;

public class substr {
	public static String reverse(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			res = c + res;
		}
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcbbca";
		int mlen=0;
		String mstr="";
		for(int i = 0; i<s.length(); i++) {
			String res = "";
			for(int j=i; j<s.length();j++) {
				res = res + s.charAt(j);
				//System.out.println(res);
				if(res.equals(reverse(res))){
					if(res.length()>mlen) {
						mlen=res.length();
						mstr=res;
					}
				}
			}
		}
		System.out.println(mstr);
		System.out.println(mlen);
		
	}

}
