package com.app.twl.main.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerDetails {

	
	private int customerId;
	private String customerName;
	private String customerMobileNo;
	private String customerEmailId;
	private String customerGender;
	private String customerDob;
	private int customerAge;
	private String customerQualification;
	private String policeStation;
	private String maritalStatus;
	private int loanNo;
	private int statusCode;
	private String occupationType;
	private double incomeDetails;
	private Lead leadId;
	private BankDetails bankDetails;
	private List<PreviousLoanDetails> previousLoanDetails;
	private Documents documentDetails;
	
	
	
	public Documents getDocumentDetails() {
		return getDocumentDetails();
	}

	public void setDocumentDetails(Documents documentDetails) {
		this.documentDetails = documentDetails;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
	public List<GuarantorDetails> getGuarantorDetails() {
		return guarantorDetails;
	}

	public void setGuarantorDetails(List<GuarantorDetails> guarantorDetails) {
		this.guarantorDetails = guarantorDetails;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMobileNo() {
		return customerMobileNo;
	}

	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerDob() {
		return customerDob;
	}

	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerQualification() {
		return customerQualification;
	}

	public void setCustomerQualification(String customerQualification) {
		this.customerQualification = customerQualification;
	}

	public String getPoliceStation() {
		return policeStation;
	}

	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}

	public Lead getLeadId() {
		return leadId;
	}

	public void setLeadId(Lead leadId) {
		this.leadId = leadId;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public String getOccupationType() {
		return occupationType;
	}

	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}

	public List<PreviousLoanDetails> getPreviousLoanDetails() {
		return previousLoanDetails;
	}

	public void setPreviousLoanDetails(List<PreviousLoanDetails> previousLoanDetails) {
		this.previousLoanDetails = previousLoanDetails;
	}

	public double getIncomeDetails() {
		return incomeDetails;
	}

	public void setIncomeDetails(double incomeDetails) {
		this.incomeDetails = incomeDetails;
	}
private List<GuarantorDetails> guarantorDetails=new ArrayList();
	
	
	private List<Address> address=new ArrayList();
	
}
