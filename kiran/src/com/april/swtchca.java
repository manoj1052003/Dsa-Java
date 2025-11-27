package com.april;
import java.util.*;

public class swtchca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter day : ");
		int n = sc.nextInt();
		switch(n) {
		
		case 1:
			System.out.println("monday");
			break;
			
		case 2:
			System.out.println("tuesday");
			break;
			
		case 3:
			System.out.println("wednesday");
			break;
			
		default:
			System.out.println("holiday");
			break;
		}
		
	}

}
