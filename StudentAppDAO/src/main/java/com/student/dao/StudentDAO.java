package com.student.dao;

import java.util.ArrayList;

import com.student.dto.Student;

public interface StudentDAO {

	public boolean insertstudent(Student s);

	public boolean updatestudent(Student s);

	public boolean deletestudent(Student s);

	public Student getstudent(String mail, String password);

	public Student getstudent(long phone, String mail);

	public ArrayList<Student> getstudent();

	public Student getstudent(String name);

}
