package com.csr;
import java.util.*;

public class arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "silent";
		String b = "listen";
		char [] arr1 = a.toCharArray();
		char [] arr2 = b.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("its anagram");
		}
		else {
			System.out.println("its not");
		}
		
	}

}
