package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.InputValidator;

public class InputValidatorTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter UserName: ");
		String userName = sc.next();

		System.out.println("Enter Password: ");
		String password = sc.next();

		System.out.println("Enter Email");
		String email = sc.next();

		InputValidator validator = new InputValidator();

		if (isValidUser(userName, password, email, validator)) {
			System.out.println("\n Valid User");
		} else {
			System.out.println("\n Not Valid User");
		}

//		if( !validator.userNameValidator(userName) || !validator.passwordValidator(password) || !validator.emailValidator(email) ) {
//			System.out.println("Not Valid");
//		}
//		else {
//			System.out.println("Valid!");
//		}

		sc.close();
	}

	private static boolean isValidUser(String userName, String password, String email, InputValidator validator) {
		return validator.userNameValidator(userName) && validator.passwordValidator(password)
				&& validator.emailValidator(email);
	}
}