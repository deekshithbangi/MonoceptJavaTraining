package com.monocept.model;

public class Account {
	private long accountNumber;
	private String accountType;
	private String accountHolderName;
	private double balance;

//	Getters
	public long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

//	Setters 
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

// Create a class Account(accountnumber, accounttype, name, balance). Write methods to initialize and display details of 2 accounts.
