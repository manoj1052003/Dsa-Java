package com.student.app;

import java.util.Scanner;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOimp;
import com.student.dto.Student;

public class Signup {
	
	public static void signup() {//doubt
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		StudentDAO sdao = new StudentDAOimp();
		
		System.out.println("--------------signup form-----------");
		System.out.println("enter the name");
		//String name = sc.next();
		//s.setName(name);
		
		s.setName(sc.next());
		System.out.println("enter the phone number");
		s.setPhone(sc.nextLong());
		System.out.println("enter the mail id");
		s.setMail(sc.next());
		System.out.println("enter the branch");
		s.setBranch(sc.next());
		System.out.println("enetr location");
		s.setLoc(sc.next());
		while(true){
			System.out.println("enter password");
			String pass1 = sc.next();
			System.out.println("confirm password");
			String pass2 = sc.next();
			
			if(pass1.equals(pass2)) {
				s.setPassword(pass2);
				boolean result = sdao.insertstudent(s);
				if(result) {
					System.out.println("Data added succ");
				}
				else {
					System.out.println("idiot not added data");
				}
				break;
			}
			else {
				System.out.println("password missmatch");
				System.out.println("try again");
				continue;
			}
		}
		
		
	}

	private static StudentDAO StudentDAOimp(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

}
