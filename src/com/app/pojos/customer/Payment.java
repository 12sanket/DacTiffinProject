package com.app.pojos.customer;

import java.util.Date;

public class Payment {

	private Integer paymentId;
	private String paymentUPI;
	private String paymentCardNumber;
	private Date paymentCardExpiryDate;
	private int paymentCardCVV;
	
	public Payment() {
		System.out.println("Payemnt Pojo");
	}

	public Payment(String paymentUPI, String paymentCardNumber, Date paymentCardExpiryDate, int paymentCardCVV) {
		super();
		this.paymentUPI = paymentUPI;
		this.paymentCardNumber = paymentCardNumber;
		this.paymentCardExpiryDate = paymentCardExpiryDate;
		this.paymentCardCVV = paymentCardCVV;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentUPI() {
		return paymentUPI;
	}

	public void setPaymentUPI(String paymentUPI) {
		this.paymentUPI = paymentUPI;
	}

	public String getPaymentCardNumber() {
		return paymentCardNumber;
	}

	public void setPaymentCardNumber(String paymentCardNumber) {
		this.paymentCardNumber = paymentCardNumber;
	}

	public Date getPaymentCardExpiryDate() {
		return paymentCardExpiryDate;
	}

	public void setPaymentCardExpiryDate(Date paymentCardExpiryDate) {
		this.paymentCardExpiryDate = paymentCardExpiryDate;
	}

	public int getPaymentCardCVV() {
		return paymentCardCVV;
	}

	public void setPaymentCardCVV(int paymentCardCVV) {
		this.paymentCardCVV = paymentCardCVV;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentUPI=" + paymentUPI + ", paymentCardNumber="
				+ paymentCardNumber + ", paymentCardExpiryDate=" + paymentCardExpiryDate + ", paymentCardCVV="
				+ paymentCardCVV + "]";
	}
	
	
}
