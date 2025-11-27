package com.july;

public class evenupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "peNTAgon";
		String res = "";
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>=97 && ch<=122) {
				ch = (char)(ch -32);
				res = res + ch;
			}
			else {
				res = res + ch;
			}
		}
		System.out.println(res);	
	}

}
