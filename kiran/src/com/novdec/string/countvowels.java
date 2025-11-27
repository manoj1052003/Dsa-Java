package com.novdec.string;

public class countvowels {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pentagon space";
		int countv=0;
		int countc=0;
		int counts=0;
		for (int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if(c==' ') {
				counts++;
			}
			else if (c =='a'|| c=='e' || c=='i' || c=='o' || c=='u') {
				countv++;
			}
			else {
				countc++;
			}
			
		}
		System.out.println(counts);
		System.out.println(countv);
		System.out.println(countc);
		

	}

}
