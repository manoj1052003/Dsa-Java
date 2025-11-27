package com.bank.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bank.connection.connector;
import com.bank.dto.Customer;
import com.bank.dto.Transaction;

public class PrintPassBook {
	
	
	private Connection con = null;
	ResultSet rs = null;
	
	public PrintPassBook() {
		this.con = connector.requestconnection();
	}
	

	public void print(Customer c) {
		String querry = "SELECT * FROM PASSBOOK WHERE USER_ACC=?";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(querry);
			ps.setLong(1, c.getAcc_no());
			
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("trans_id"+" "+rs.getLong("TRANS_ID"));
				System.out.println("ACC_NO"+" "+rs.getLong("USER_ACC"));
				System.out.println("TYPE"+" "+rs.getString("TRANS_TYPE"));
				System.out.println("amount"+" "+rs.getDouble("AMOUNT"));
				System.out.println("DATE"+" "+rs.getString("TRANS_DATE"));
				System.out.println("---------------------------------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
