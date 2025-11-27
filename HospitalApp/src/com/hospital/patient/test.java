package com.hospital.patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {


	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		
		String url = "jdbc:mysql://localhost:3306/hospital_p";
		String user = "root";
		String pass = "tiger"; 
		String query = "INSERT INTO PATIENTS VALUES(0,'NAME',SYSDATE(),DATE_ADD(SYSDATE(),INTERVAL 5 DAY),NULL)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded and register successfully");
			
			con = DriverManager.getConnection(url, user, pass);
			
			System.out.println("connection established");
			//System.out.println(con);
			
			st = con.createStatement();
			
			System.out.println("platform created");
			System.out.println(st);
			
			int i=st.executeUpdate(query);
			System.out.println(i);
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
