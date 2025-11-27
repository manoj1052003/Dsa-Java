package com.june19;
import java.util.*;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PEnTagOn";
		//res : peNtAGoN
		String res = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>=65 && ch<=90) {
				ch = (char) (ch + 32);
				res = res + ch;
			}
			else {
				ch = (char) (ch - 32);
				res = res + ch;
			}
		}
		System.out.println(res);
	}

}
