package com.strings;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "rama";
		char [] ch = st.toCharArray();
		System.out.println(ch);
		int count = 0;
		for (int i = 0 ; i < ch.length; i++) {
			System.out.println(ch[i]);
			count+=1;
		}
		int length = st.length();
		System.out.println(length);
		System.out.println(count);
		

	}

}
