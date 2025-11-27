package com.strings;

public class longpalsubstr {
	public static String find_long_str(String s) {
		String res="";
		int reslength=0;
		for(int i=0; i<s.length(); i++) {
			int l = i;
			int r = i;
			while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
				if(r-l+1 > reslength) {
					res=s.substring(l,r+1);
					reslength=r-l+1;
				}
				l--;
				r++;
			}
			int le = i;
			int re = i+1;
			while(le>=0 && re<s.length() && s.charAt(le)==s.charAt(re)) {
				if(re-le+1 > reslength) {
					res=s.substring(le,re+1);
					reslength=re-le+1;
				}
				le--;
				re++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "zabccabaz";
		String substrpal = find_long_str(s);
		System.out.println(substrpal);
	}

}
