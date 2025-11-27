package com.practice;

public class Shopping {
	
	Payment p ;
	
	
	
	public Shopping(Payment p) {
		this.p = p;
	}


	void doPayment(int amt) {
		
		p.pay();
	}


	public void setP(Payment p) {
		this.p = p;
	}
}
