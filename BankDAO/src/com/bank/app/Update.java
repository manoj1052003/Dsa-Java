package com.bank.app;

import java.util.Scanner;

import com.bank.dao.CustomerDAO;
import com.bank.dao.CustomerDAOimp;
import com.bank.dto.Customer;

public class Update {

	public static void updateUser(Customer c) {
		
		CustomerDAO cdao = new CustomerDAOimp();
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		boolean res = false;
		do {
			System.out.println("enter choice");
			
			System.out.println("1 : to update name ");
			System.out.println("2 : to update phone number");
			System.out.println("3 : to update mail");
			System.out.println("4 : to update pin");
			System.out.println("5 : to previous menu");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("enter the name you wanna update");
				c.setName(sc.next());
				res = cdao.updateCustomer(c);
				break;
			case 2:
				System.out.println("enter the phone number you wanna update");
				c.setPhone(sc.nextLong());
				res = cdao.updateCustomer(c);
				break;
			case 3:
				System.out.println("enter the mail you wanna update");
				c.setMail(sc.next());
				res = cdao.updateCustomer(c);
				break;
			case 4:
				System.out.println("enter the pin you wanna update");
				int p1 = sc.nextInt();
				System.out.println("confirm the pin");
				int p2 = sc.nextInt();
				if(p1==p2) {
					c.setPin(p1);
					res = cdao.updateCustomer(c);	
				}
				else {
					System.out.println("entered pin and confirm pin not matching bro");
				}
				break;
				
			case 5:
				System.out.println("going back to previous menu");
				break;
			default:
				System.out.println("invalid choice lodu");
			}
			
			if(res) {
				System.out.println("update aagide guru");
			}
			else {
				System.out.println("update aagilla guru");
			}
		}
		while(choice!=5);
		
		
	}
}
