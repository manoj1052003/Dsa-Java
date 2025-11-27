package com.june;
import java.util.*;
public class stringbasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a b#";
		int counts = 0;
		int countv = 0;
		int countc = 0;
		int countspl = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if((c >=97 && c<=122) || c ==' ' ) {
				if(c==' ') {
					counts++;
				}
				else if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
					countv++;
				}
				else {
					countc++;
				}
			}
			else {
				countspl++;
			}
			
		}
		System.out.println(counts);
		System.out.println(countv);
		System.out.println(countc);
		System.out.println(countspl);
		
		
	}

}
