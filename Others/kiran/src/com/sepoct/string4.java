package com.sepoct;

public class string4 {
	
	public static boolean check_pali(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			res = s.charAt(i) + res;
		}
		if(res.equals(s)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bamalayalamaaa";
		String l_str = "";
		int l_len = 0;
		for(int i=0; i<s.length(); i++) {
			String res = "";
			for(int j =i; j<s.length(); j++) {
				res = res + s.charAt(j);
				if(check_pali(res)) {
					if(res.length()>l_len) {
						l_str = res;
						l_len = res.length();
					}
				}
			}
		}
		System.out.println(l_str);
		System.out.println(l_len);
		
	}

}
