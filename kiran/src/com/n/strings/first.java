package com.n.strings;
import java.util.*;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char [] arr = s.toCharArray();
		System.out.println(s);
		for (int i=0; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}

}
