package com.app.twl.main.model;



public class Lead {
	
	
	private int leadId;
	private String customerAdharcard;
	private String customerPancard;
	private long customerAdharno;
	private String customerPanno;
	private String date;
	private int statusCode;
	private String leadDateAndTime;
	private Enquiry enquiryId;
	
	
	public int getLeadId() {
		return leadId;
	}
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}
	public Enquiry getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(Enquiry enquiryId) {
		this.enquiryId = enquiryId;
	}
	public String getCustomerAdharcard() {
		return customerAdharcard;
	}
	public void setCustomerAdharcard(String customerAdharcard) {
		this.customerAdharcard = customerAdharcard;
	}
	public String getCustomerPancard() {
		return customerPancard;
	}
	public void setCustomerPancard(String customerPancard) {
		this.customerPancard = customerPancard;
	}
	public long getCustomerAdharno() {
		return customerAdharno;
	}
	public void setCustomerAdharno(long customerAdharno) {
		this.customerAdharno = customerAdharno;
	}
	public String getCustomerPanno() {
		return customerPanno;
	}
	public void setCustomerPanno(String customerPanno) {
		this.customerPanno = customerPanno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getLeadDateAndTime() {
		return leadDateAndTime;
	}
	public void setLeadDateAndTime(String leadDateAndTime) {
		this.leadDateAndTime = leadDateAndTime;
	}
	
}
