package com.august;
import java.util.*;
public class str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		String res = "";
		for(int i=s.length()-1; i>=0; i-- ) {
			res = res + s.charAt(i);
		}
		System.out.println(res);
		if(s.equals(res)) {
			System.out.println("pali");
		}
		else {
			System.out.println("its not");
		}
		
	}

}
