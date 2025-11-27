package com.strings;

public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		String ns = "";
		
		for (int i = 0; i < s.length(); i+=1) {
			char c = s.charAt(i);
			ns = c + ns;
			
		}
		
		if (ns.equals(s)) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not");
		}

	}

}
