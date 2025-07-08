package com.monocept.model;

import com.monocept.exceptions.InsufficentFundsException;
import com.monocept.exceptions.NegativeAmountException;

public class Account {
	private String accountName;
	private long accountNumber;
	private double accountBalance;

	public Account(String accountName, long accountNumber, double accountBalance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

//	Withdrawal 
	public void withdrawal(double amount) throws InsufficentFundsException, NegativeAmountException {
		if (accountBalance < 0) {
			throw new NegativeArraySizeException("Cannot withdraw a negative amount");
		}
		if (accountBalance < amount) {
			throw new InsufficentFundsException();
		}
		this.accountBalance -= amount;
	}

//	Deposit
	public void deposit(double amount) throws NegativeAmountException {
		if (amount < 0) {
			throw new NegativeAmountException("Cannot deposit a negative amount");
		}
		this.accountBalance += amount;
	}
}
