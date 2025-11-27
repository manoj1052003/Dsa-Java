package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.student.connection.Connector;
import com.student.dto.Student;

public class StudentDAOimp implements StudentDAO {

	private Connection con;
	
	public StudentDAOimp () {
		this.con = Connector.requestconnection();
	}
	
	//here we will be writing all the JDBC logics
	@Override
	public boolean insertstudent(Student s) {
		int i = 0;
		String query = "INSERT INTO STUDENT VALUES (0,?,?,?,?,?,?,SYSDATE())";
		try {
			PreparedStatement ps =  con.prepareStatement(query);
			ps.setString(1, s.getName());
			ps.setLong(2, s.getPhone());
			ps.setString(3, s.getMail());
			ps.setString(4, s.getBranch());
			ps.setString(5, s.getLoc());
			ps.setString(6, s.getPassword());
			ps.setInt(7,s.getId());
			i = ps.executeUpdate();
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updatestudent(Student s) {
		//System.out.println(s);
		int i=0;
		String query = "UPDATE STUDENT SET NAME=?, PHONE =? ,MAIL=?,BRANCH=?,LOCATION=?,PASSWORD=? WHERE ID=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, s.getName());
			ps.setLong(2, s.getPhone());
			ps.setString(3, s.getMail());
			ps.setString(4, s.getBranch());
			ps.setString(5, s.getLoc());
			ps.setString(6, s.getPassword());
			ps.setInt(7, s.getId());
			//update id also
			i= ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deletestudent(Student s) {
		// TODO Auto-generated method stub
		int i=0;
		String query="delete from student where name=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, s.getName());
			i=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public Student getstudent(String mail, String password) {
		Student s = null;
		String query = "SELECT * FROM STUDENT WHERE MAIL=? AND PASSWORD=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, mail);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				s = new Student();
				s.setId(rs.getInt("ID"));
				s.setName(rs.getString("NAME"));
				s.setPhone(rs.getLong("PHONE"));
				s.setMail(rs.getString("MAIL"));
				s.setBranch(rs.getString("BRANCH"));
				s.setLoc(rs.getString("LOCATION"));
				s.setPassword(rs.getString("PASSWORD"));
				s.setDate(rs.getString("DATE"));
			}
			
			return s;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	@Override
	public Student getstudent(long phone, String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> getstudent() {
		// TODO Auto-generated method stub
		ArrayList<Student> arr = new ArrayList<>();
		Student s = null;
		String query = "SELECT * FROM STUDENT WHERE ID!=1";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				s = new Student();
				s.setId(rs.getInt("ID"));
				s.setName(rs.getString("NAME"));
				s.setPhone(rs.getLong("PHONE"));
				s.setMail(rs.getString("MAIL"));
				s.setBranch(rs.getString("BRANCH"));
				s.setLoc(rs.getString("LOCATION"));
				s.setDate(rs.getString("DATE"));
				
				arr.add(s);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;

	}

	@Override
	public Student getstudent(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
