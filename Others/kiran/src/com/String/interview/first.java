package com.String.interview;

public class first {
	
public static void String_test(String s) {
		
		String res = "";
		for(int i=0; i<s.length(); i+=2) {
			int val = Character.getNumericValue(s.charAt(i+1));
			while(val!=0) {
				res = res + s.charAt(i);
				val--;
			}
		}
		System.out.println(res);
		
		
	}

	public static void main(String[] args) {
		String s = "a2b3c5";
		String_test(s);

	}

}
