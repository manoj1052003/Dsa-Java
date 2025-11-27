package com.strings;

public class reverse {
	
	static String reverseword(String s1) {
		
		String res= "";
		for(int i =0; i < s1.length(); i++) {
			
			char a = s1.charAt(i);
			res = a + res;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "rama is running";
		String word = "";
		
		for (int i = 0; i <s1.length() ; i++) {
			
			if (s1.charAt(i)==32) {
				//String ans = reverseword(word);
				System.out.print(word+" ");
				word = "";	
			}
			else {
				word=s1.charAt(i)+ word;
			}		
		}
		System.out.print(word+" ");

	}

}
