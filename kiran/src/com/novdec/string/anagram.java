package com.novdec.string;
import java.util.Arrays;

public class anagram {
	public static void sort_string (char[] s) {
		for (int i=0; i<s.length-1;i++) {
			for(int j=0; j<s.length-1;j++) {
				if(s[j]>s[j+1]) {
					char temp = s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="silent";
		String s2="listen";
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		

	}

}
