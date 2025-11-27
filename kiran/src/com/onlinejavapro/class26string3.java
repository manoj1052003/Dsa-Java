package com.onlinejavapro;

public class class26string3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABDEF";
		String res = "";
		for(int i=0 ; i<s.length(); i++) {
			char ch = s.charAt(i);
			ch++;
			res = ch + res;
		}
		System.out.println(res);
	}

}
