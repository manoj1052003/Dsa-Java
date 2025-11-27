package com.bank.dao;

import java.util.ArrayList;

import com.bank.connection.connector;
import com.bank.dto.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAOimp implements CustomerDAO {

	private Connection con = null;
	ResultSet rs = null;
	
	public CustomerDAOimp() {
		this.con = connector.requestconnection();
	}
	
	@Override
	public boolean insertCustomer(Customer c) {
		int i = 0;
		String query = "INSERT INTO CUSTOMER VALUES(0,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,c.getName());
			ps.setLong(2, c.getPhone());
			ps.setString(3, c.getMail());
			ps.setDouble(4, c.getBalance());
			ps.setInt(5, c.getPin());
			
			i = ps.executeUpdate();
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public Customer getCustomer(long acc_no, int pin) {
		String query = "SELECT * FROM CUSTOMER WHERE ACC_NO=? AND PIN=?";
			
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, acc_no);
			ps.setInt(2, pin);
			Customer c = new Customer();
			ResultSet rs =  ps.executeQuery();
			
			
			while(rs.next()) {
				c.setAcc_no(rs.getLong("ACC_NO"));
				c.setName(rs.getString("Name"));
				c.setPhone(rs.getLong("phone"));
				c.setMail(rs.getString("mail"));
				c.setBalance(rs.getDouble("balance"));
				c.setPin(rs.getInt("pin"));
				System.out.println("printing object"+" "+c);
			}
			return c;
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Customer getCustomer(long phone, String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer(long acc) {
		String query = "SELECT * FROM CUSTOMER WHERE ACC_NO=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, acc);
			Customer c = new Customer();
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				c.setAcc_no(rs.getLong("ACC_NO"));
				c.setName(rs.getString("Name"));
				c.setPhone(rs.getLong("phone"));
				c.setMail(rs.getString("Mail"));
				c.setBalance(rs.getDouble("balance"));
				c.setPin(rs.getInt("pin"));
			}
			return c;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Customer> getCustomer() {
		// TODO Auto-generated method stub
		ArrayList<Customer> arr = new ArrayList<>();
		String query = "SELECT * FROM CUSTOMER WHERE ACC_NO !=1100110011";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				Customer c = new Customer();
				c.setAcc_no(rs.getLong("acc_no"));
				c.setName(rs.getString("name"));
				c.setPhone(rs.getLong("phone"));
				c.setMail(rs.getString("mail"));
				c.setBalance(rs.getDouble("balance"));
				c.setPin(rs.getInt("pin"));
				arr.add(c);
			}
			return arr;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean updateCustomer(Customer c) {
		int i=0;
		String query = "UPDATE CUSTOMER SET NAME=?,PHONE=?,MAIL=?,PIN=?,BALANCE=? WHERE ACC_NO=?";
		
		try {
			//con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, c.getName());
			ps.setLong(2, c.getPhone());
			ps.setString(3, c.getMail());
			ps.setInt(4, c.getPin());
			ps.setDouble(5, c.getBalance());
			ps.setLong(6, c.getAcc_no());
			
			i = ps.executeUpdate();
			System.out.println(i);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			
			return true;
		}
		else {
			
			return false;
		}
	}

	@Override
	public boolean deleteCustomer(long acc_no) {
		int i=0;
		String query="delete from customer where ACC_NO=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, acc_no);
			i = ps.executeUpdate();
			
			if(i>0) {
				return true;
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
}
