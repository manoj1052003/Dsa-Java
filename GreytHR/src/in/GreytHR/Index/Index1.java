package in.GreytHR.Index;

import java.util.Scanner;

public class Index1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<==welcome to GreytHR==>");
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		do {
			System.out.println("1 : Login");
			System.out.println("2 : Signup");
			System.out.println("3 : Exit");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.println("");
			
			case 2:
				
			case 3:
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
		while(choice!=3);

	}

}
