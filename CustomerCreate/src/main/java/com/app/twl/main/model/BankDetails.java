package com.app.twl.main.model;


public class BankDetails {
	
	
	private int bid;
	private String bankAccountNo;
	private String bankAccountHolderName;
	private Branch bankBranch;
	
	
	
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getBankAccountHolderName() {
		return bankAccountHolderName;
	}
	public void setBankAccountHolderName(String bankAccountHolderName) {
		this.bankAccountHolderName = bankAccountHolderName;
	}
	public Branch getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(Branch bankBranch) {
		this.bankBranch = bankBranch;
	}


}
