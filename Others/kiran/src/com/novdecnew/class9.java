package com.novdecnew;
import java.util.*;
public class class9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter val of num");
		int num = 100;
		for(int i=1; i<=num; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			else {
				System.out.println(i);
			}
		}
		
	}

}
