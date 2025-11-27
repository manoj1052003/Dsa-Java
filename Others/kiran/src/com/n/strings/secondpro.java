package com.n.strings;

public class secondpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count upper case
		String s = "hello";
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
