package com.cg.bean;

import java.util.Random;

public class RechargeDetails {
	
	//to generate random Transaction ID
	Random random=new Random();
	
	String rechargeType;
	String currentOperator;
	String mobileNo;
	double amount;
	int transactionID=random.nextInt(10000);
	
	public RechargeDetails(String rechargeType, String currentOperator,
			String mobileNo, double amount, int transactionID) {
		super();
		this.rechargeType = rechargeType;
		this.currentOperator = currentOperator;
		this.mobileNo = mobileNo;
		this.amount = amount;
		this.transactionID = transactionID;
	}
	public RechargeDetails() {
		super();
	}
	public String toString() {
		return "----RechargeDetails---\nRecharge Type=" + rechargeType
				+ ",\ncurrentOperator=" + currentOperator + ",\nmobileNo="
				+ mobileNo + ",\namount=" + amount + ",\ntransactionID="
				+ transactionID;
	}
	public String getRechargeType() {
		return rechargeType;
	}
	public void setRechargeType(String rechargeType) {
		this.rechargeType = rechargeType;
	}
	public String getCurrentOperator() {
		return currentOperator;
	}
	public void setCurrentOperator(String currentOperator) {
		this.currentOperator = currentOperator;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	
	
	
}
