package com.student.app;

import java.util.Scanner;

public class WellcomeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("your are not welocome to app");
		
		do {
			System.out.println("1, login");
			System.out.println("2, signup");
			System.out.println("3, exit");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				Login.login();
				break;
				
			case 2:
				Signup.signup();
				break;
				
			case 3:
				System.out.println("application closed");
				break;
				
			default:
				System.out.println("invalid");
			}
			
		}
		while(choice!=3);
	}

}
