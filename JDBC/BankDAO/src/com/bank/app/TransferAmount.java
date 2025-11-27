package com.bank.app;

import com.bank.dao.CustomerDAO;
import com.bank.dao.CustomerDAOimp;
import com.bank.dao.TransactionDAO;
import com.bank.dao.TransactionDAOimp;
import com.bank.dto.Customer;
import com.bank.dto.Transaction;

public class TransferAmount {

	public static void transfer(Customer sender, double amount, long acc_no) {
		CustomerDAO cdao = new CustomerDAOimp();
		
		Transaction t1 = null;
		Transaction t2 = null;
		
		Customer receiver =  cdao.getCustomer(acc_no);
		TransactionDAO tdao = new TransactionDAOimp();
		
		boolean res1 = false;
		boolean res2 = false;
		
		if(amount<sender.getBalance() && amount>0 && sender.getAcc_no()!=receiver.getAcc_no()) {
			sender.setBalance(sender.getBalance()-amount);
			receiver.setBalance(receiver.getBalance()+amount);
			res1 = cdao.updateCustomer(sender);
			res2 = cdao.updateCustomer(receiver);
			
			
			t1 = new Transaction();
			t1.setTransaction_id(TransactionID.getTranID());
			t1.setUser_acc(sender.getAcc_no());
			t1.setRec_acc(acc_no);
			t1.setTransaction_type("DEBITED");
			t1.setAmount(amount);
			t1.setBalance(sender.getBalance());
			
			tdao.insertTransaction(t1);
			
			t2 = new Transaction();
			t2.setTransaction_id(t1.getTransaction_id());
			t2.setUser_acc(acc_no);
			t2.setRec_acc(t1.getUser_acc());
			t2.setTransaction_type("CREDITED");
			t2.setAmount(amount);
			t2.setBalance(receiver.getBalance());

			tdao.insertTransaction(t2);
			if(res1 && res2) {
				System.out.println("transaction successfull");
			}
			else {
				System.out.println("trans failed");
			}
		}
		else {
			System.out.println("insufficient code");
		}

	}
}
