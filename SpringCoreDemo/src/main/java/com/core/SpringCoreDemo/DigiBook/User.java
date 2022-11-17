package com.core.SpringCoreDemo.DigiBook;

public class User {
	
	private UserType userType;
	private String name;
	private String emailId;
	private String paymentId;
	private String subscriptionId;
	
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public User(UserType userType, String name, String emailId, String paymentId, String subscriptionId) {
		super();
		this.userType = userType;
		this.name = name;
		this.emailId = emailId;
		this.paymentId = paymentId;
		this.subscriptionId = subscriptionId;
	}

	
	
}
