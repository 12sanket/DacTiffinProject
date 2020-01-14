package com.app.pojos.common;

import java.util.Date;

public class User {

	private Integer userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private int addressId;
	private int paymentId;
	private Date userJoinDate;
	private UserType userRole;
	
	public User() {
		System.out.println("User Pojo");
	}

	public User(String userName, String userEmail, String userPassword, int addressId, int paymentId, Date userJoinDate,
			UserType userRole) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.addressId = addressId;
		this.paymentId = paymentId;
		this.userJoinDate = userJoinDate;
		this.userRole = userRole;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Date getUserJoinDate() {
		return userJoinDate;
	}

	public void setUserJoinDate(Date userJoinDate) {
		this.userJoinDate = userJoinDate;
	}

	public UserType getUserRole() {
		return userRole;
	}

	public void setUserRole(UserType userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", addressId=" + addressId + ", paymentId=" + paymentId + ", userJoinDate="
				+ userJoinDate + ", userRole=" + userRole + "]";
	}
	
	
}
