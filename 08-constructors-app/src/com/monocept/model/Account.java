package com.monocept.model;

public class Account {

	private long accountNumber;
	private String accountType;
	private String accountHolderName;
	private double balance;

//	Constructors 
	public Account() {
		accountNumber = 1001;
		accountType = "savings";
		accountHolderName = "";
		balance = 0.0;
	}

	public Account(long accountNumber, String accountType, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

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

// Display Account Details
	public void displayAccountDetails() {
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Account Type: " + this.accountType);
		System.out.println("Account Holder Name: " + this.accountHolderName);
		System.out.println("Account Balance: " + this.balance);
	}
}