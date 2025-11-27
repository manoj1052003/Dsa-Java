package com.grooming;
import java.util.*;
public class anagrammmmmm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "anagram";
		String b = "margana";
		char [] arr1 = a.toCharArray();
		char [] arr2 = b.toCharArray();

		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
 
		
		if(Arrays.equals(arr1, arr2)){
			System.out.println("Anagram");
		}
		else {
			System.out.println("its not");
		}
	}

}
