package com.bank.app;

import java.util.Scanner;

public class WelcomeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("you're not welcome to the bank");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1 : Login");
			System.out.println("2 : Signup");
			System.out.println("3 : Exit");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				Login.login();
				break;
				
			case 2:
				Signup.signup();
				break;
				
			case 3:
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
		while(choice<3);
	}

}
