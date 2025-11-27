package com.String.interview;

public class second {
	
	public static void String_solution(String s) {
		String res = "";
		int count = 1;
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
			else {
				res = res + s.charAt(i) +count;
				count = 1;
			}
		}
		res = res + s.charAt(s.length()-1) +count;
		System.out.println(res);
	}
	

	public static void main(String[] args) {
		String s = "aabbbccdddd";
		String_solution(s);
		

	}

}
