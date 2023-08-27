package com.fiap;

import java.util.Date;

public class Transaction {
	private int transactionId;
	private User user;
	private double amount;
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	private Date date;
	private Category category;
	
	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Transaction(int transactionId, User user, double amount, Date date, Category category) {
		this.transactionId = transactionId;
		this.user = user;
		this.amount = amount;
		this.date = date;
		this.category = category;
	}
}
