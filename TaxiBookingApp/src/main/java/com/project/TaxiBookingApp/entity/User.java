package com.project.TaxiBookingApp.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class User {
	
	private String username;
	private String password;
	private String phoneNo;
	private String emailId;
		
	public User(String username, String password, String phoneNo, String emailId) {
		super();
		this.username = username;
		this.password = password;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}

	public User() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
