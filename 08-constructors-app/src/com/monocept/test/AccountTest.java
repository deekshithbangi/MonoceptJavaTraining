package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Default Constructor
		Account accA = new Account();
		accA.displayAccountDetails();
		System.out.println();

//		Parameterised Constructor
		Account accB = new Account(1002, "current", "deekshith", 99.99);

		System.out.println("Account 2 Details: ");

		accB.displayAccountDetails();
		System.out.println();

//		Manual Taking of Inputs
		Account accC = new Account();
		System.out.println("Enter 3rd Account Details: ");

		System.out.print("Account Number: ");
		long accountNumber = sc.nextLong();
		accC.setAccountNumber(accountNumber);

		System.out.print("Account Type: ");
		String accountType = sc.next();
		accC.setAccountType(accountType);

		System.out.print("Account Holder Name: ");
		String accountHolderName = sc.next();
		accC.setAccountHolderName(accountHolderName);

		System.out.print("Balance: ");
		double balance = sc.nextDouble();
		accC.setBalance(balance);

		accC.displayAccountDetails();

		sc.close();
	}
}
