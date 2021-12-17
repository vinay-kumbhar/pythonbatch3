package com.app.twl.main.model;


public class Branch {
	
	
	private int branchId;
	private String branchName;
	private String branchType;
	private String ifscCode;
	private long micrCode;
	private int branchCode;
	private long branchContactno;
	private String branchEmailid;
	
	private Address branchAddress;
	
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchType() {
		return branchType;
	}
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public long getMicrCode() {
		return micrCode;
	}
	public void setMicrCode(long micrCode) {
		this.micrCode = micrCode;
	}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	public long getBranchContactno() {
		return branchContactno;
	}
	public void setBranchContactno(long branchContactno) {
		this.branchContactno = branchContactno;
	}
	public String getBranchEmailid() {
		return branchEmailid;
	}
	public void setBranchEmailid(String branchEmailid) {
		this.branchEmailid = branchEmailid;
	}
	public Address getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(Address branchAddress) {
		this.branchAddress = branchAddress;
	}

}
