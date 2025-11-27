package com.july;
import java.util.*;
public class stringbasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hi all goodmorning have a nice day";
		String [] arr = s.split(" ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length()%2==0) {
				System.out.println(arr[i]);
			}
			
		}
		
	}

}
