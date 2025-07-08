package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account("deekshith", 1001, 10000);

		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("Choose Option: " + "\n1.Deposit" + "\n2.Withdrawal" + "\n3.Display" + "\n4.Exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("You have choosen Deposit Option");

				System.out.println("Please enter amount to Deposite");
				double depositeAmount = sc.nextDouble();

				try {
					account.deposit(depositeAmount);
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 2:
				System.out.println("You have choosen Withdrawal Option");

				System.out.println("Please enter amount to Withdrawal: ");
				double withdrawalAmount = sc.nextDouble();

				try {
					account.withdrawal(withdrawalAmount);
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 3:
				System.out.println("You have choosen Display Option");

				System.out.println("Account Holder Name: " + account.getAccountName());
				System.out.println("Account Number: " + account.getAccountNumber());
				System.out.println("Account Balance: " + account.getAccountBalance());
				break;

			case 4:
				System.out.println("Thank you for visiting!!");
				exit = true;
				break;
			default:
				System.out.println("Enter valid input option!!");
			}
		}
		sc.close();
	}
}
