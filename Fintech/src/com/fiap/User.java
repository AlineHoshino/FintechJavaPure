package com.fiap;
import java.util.List;
import java.util.ArrayList;

public class User {
	private int userId;
	private String username;
	private String password;
	private String email;
	private List<Transaction> transactions;
	
	public User(int userId, String username, String password, String email) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.transactions = new ArrayList<>();

	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Transaction> getTransactions() {
	        return transactions;
	}

	public void addTransaction(Transaction transaction) {
	        transactions.add(transaction);
	}
}
