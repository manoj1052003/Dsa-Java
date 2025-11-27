package com.student.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOimp;
import com.student.dto.Student;

public class Login {

	public static void login() {
		
		Scanner sc = new Scanner(System.in);
		
		StudentDAO sdao = new StudentDAOimp();
		System.out.println("--------------login form-----------");
		boolean ex = false;
		while(true) {
			if(ex) {
				break;
			}
			System.out.println("enter mail id");
			String mail = sc.next();
			System.out.println("enter password");
			String password = sc.next();
			
			Student s = sdao.getstudent(mail, password);
			
			if(s!=null) {
				System.out.println("login successfull!");
				System.out.println("welcome" +" "+s.getName());
				int choice = 0;
				
				do {
					System.out.println("1 : view credential");
					System.out.println("2 : update credentil");
					System.out.println("3 : back to main menu");
					
					if(s.getId() == 1) {
						System.out.println("4 : view all users");
						System.out.println("5 : delete user ");
						
						//break;
					}
					choice = sc.nextInt();
					switch(choice) {
					case 1 :
						System.out.println(s);
						break;
					case 2:
						Update.updateUser(s);
						break;
					case 3:
						System.out.println("loading ....");
						ex = true;
						break;
					case 4:
						ArrayList<Student> arr = sdao.getstudent();
						for(Student obj : arr) {
							System.out.println(obj.toString());
						}
						// print all user details 
						break;
					case 5:
						System.out.println("enter the student name to delete");
						Student d=new Student();
						d.setName(sc.next());
						boolean res=sdao.deletestudent(d);
						if(res) {
							System.out.println("deleted successfully");
						}
						else {
							System.out.println("failed to update");
						}
						break;
						
					default:
						System.out.println("invalid entry try again");
					}
					
						
					
				}
				while(choice!=3);
			}
			else {
				System.out.println("login failed");
				System.out.println("would you try with another password?");
				System.out.println("1 : YES ");
				System.out.println("press any for : NO ");
				int choice  = sc.nextInt();
				if(choice == 1) {
					
					continue;
				}
				else {
					System.out.println("sorry wrong password");
					System.out.println("moving to main");
					break;
				}
				
			}
		}

	}
}
