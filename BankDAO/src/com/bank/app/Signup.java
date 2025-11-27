package com.bank.app;

import java.util.Scanner;

import com.bank.dao.CustomerDAO;
import com.bank.dao.CustomerDAOimp;
import com.bank.dto.Customer;

public class Signup {

	public static void signup() {
		
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		
		CustomerDAO cdao = new CustomerDAOimp();
		
		System.out.println("--------------signup form-----------");
		
		System.out.println("enter the name");
		c.setName(sc.next());
		
		System.out.println("enter the phone number");
		c.setPhone(sc.nextLong());
		
		System.out.println("enter the mail id");
		c.setMail(sc.next());
		
		c.setBalance(0);
		
		System.out.println("enetr pin");
		int p1 = sc.nextInt();
		
		System.out.println("confirm pin");
		int p2 = sc.nextInt();
		
		if(p1 == p2) {
			c.setPin(p2);
		}
		
		boolean res = cdao.insertCustomer(c);
		
		if(res) {
			System.out.println("account created successfully!");
		}
		else {
			System.out.println("failed to create account");
		}
		
		
	}
}
