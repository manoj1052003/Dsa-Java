package com.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bank.connection.connector;
import com.bank.dto.Transaction;

public class TransactionDAOimp implements TransactionDAO{

	private Connection con = null;
	int i = 0;;
	
	public TransactionDAOimp() {
		this.con = connector.requestconnection();
	}
	ResultSet rs = null;
	@Override
	public boolean insertTransaction(Transaction t) {
		String query = "INSERT INTO PASSBOOK VALUES(?,?,?,SYSDATE(),?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, t.getTransaction_id());
			ps.setLong(2, t.getUser_acc());
			ps.setLong(3, t.getRec_acc());
			ps.setString(4, t.getTransaction_type());
			ps.setDouble(5, t.getAmount());
			ps.setDouble(6, t.getBalance());
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
	public ArrayList<Transaction> getTransaction(long user) {
		String query = "SELECT * FROM  PASSBOOK WHERE USER_ACC=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, user);
			rs = ps.executeQuery();
			ArrayList<Transaction> arr = new ArrayList<>();
			while(rs.next()) {
				Transaction t1 = new Transaction();
				t1.setTransaction_id(rs.getLong("TRANS_ID"));
				t1.setUser_acc(rs.getLong("USER_ACC"));
				t1.setRec_acc(rs.getLong("REC_ACC"));
				t1.setTransaction_type(rs.getString("TRANS_TYPE"));
				t1.setAmount(rs.getDouble("AMOUNT"));
				t1.setBalance(rs.getDouble("BALANCE"));
				arr.add(t1);
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
	public ArrayList<Transaction> getTransaction() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM  PASSBOOK";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			ArrayList<Transaction> arr = new ArrayList<>();
			while(rs.next()) {
				Transaction t1 = new Transaction();
				t1.setTransaction_id(rs.getLong("TRANS_ID"));
				t1.setUser_acc(rs.getLong("USER_ACC"));
				t1.setRec_acc(rs.getLong("REC_ACC"));
				t1.setTransaction_type(rs.getString("TRANS_TYPE"));
				t1.setAmount(rs.getDouble("AMOUNT"));
				t1.setBalance(rs.getDouble("BALANCE"));
				arr.add(t1);
			}
			return arr;
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
