package com.n.strings;
import java.util.*;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		int countv = 0;
		int countc = 0;
		int counts = 0;
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c==32) {
				counts+=1;
			}
			else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				countv++;
			}
			else {
				countc++;
			}
		}
		System.out.println("no of spaces are "+counts);
		System.out.println("no of vowles are "+countv);
		System.out.println("no of consonents are "+countc);
		sc.close();
	}
	

}
