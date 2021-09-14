package com.lt.bean;

import java.util.Date;

public class Payment {

	private double Amount;
	private String TransactionId;
	private Date PaymentDate;
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public String getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}
	public Date getPaymentDate() {
		return PaymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		PaymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [Amount=" + Amount + ", TransactionId=" + TransactionId + ", PaymentDate=" + PaymentDate + "]";
	}
	
	
}
