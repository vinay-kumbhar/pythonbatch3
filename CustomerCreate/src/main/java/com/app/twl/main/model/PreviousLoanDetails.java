package com.app.twl.main.model;


public class PreviousLoanDetails {
	
	private int id;
	private int remainingEmi;
	private double remainingAmount;
	private BankDetails bankDetails;

	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public int getRemainingEmi() {
		return remainingEmi;
	}
	public void setRemainingEmi(int remainingEmi) {
		this.remainingEmi = remainingEmi;
	}
	public double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	
}
