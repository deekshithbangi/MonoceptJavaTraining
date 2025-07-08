package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Enter details for Account 1
		Account accA = new Account();
		System.out.println("Enter First Account Details: ");

		System.out.print("Account Number: ");
		accA.setAccountNumber(sc.nextLong());

		System.out.print("Account Type: ");
		accA.setAccountType(sc.next());

		System.out.print("Account Holder Name: ");
		accA.setAccountHolderName(sc.next());

		System.out.print("Account Balance: ");
		accA.setBalance(sc.nextDouble());

//		Display Account 1
		System.out.println("1st Account Details: ");
		System.out.println("Account Number: " + accA.getAccountNumber());
		System.out.println("Account Type: " + accA.getAccountType());
		System.out.println("Account Holder Name: " + accA.getAccountHolderName());
		System.out.println("Account A Balance: " + accA.getBalance());
		System.out.println();

//		Enter details for Account 2.
		Account accB = new Account();
		System.out.print("\nEnter 2nd Account Details: ");

		System.out.print("Account Number: ");
		accB.setAccountNumber(sc.nextLong());

		System.out.print("Account Type: ");
		accB.setAccountType(sc.next());

		System.out.print("Account Holder Name: ");
		accB.setAccountHolderName(sc.next());

		System.out.print("Balance: ");
		accB.setBalance(sc.nextDouble());

//		Display Account 2 
		System.out.println("2nd Account Details: ");
		System.out.println("Account Number: " + accB.getAccountNumber());
		System.out.println("Account Type: " + accB.getAccountType());
		System.out.println("Account Holder Name: " + accB.getAccountHolderName());
		System.out.println("Account B Balance: " + accB.getBalance());

		sc.close();
	}
}
