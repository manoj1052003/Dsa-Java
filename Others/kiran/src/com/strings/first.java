package com.strings;
import java.util.*;

public class first {
	
	public static void reverse(String s) {
	    int countv =0;
	    int countc = 0;
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				countv++;
			}
			else {
				countc++;
			}
		}
		System.out.println(countv);
		System.out.println(countc);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		reverse(s);
		
		
		
		
	}

}
