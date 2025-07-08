package com.monocept.model;

public class InputValidator {

	public boolean entityValidator(String entity, int minValue, int maxValue) {
		if (entity == null || entity.isEmpty() || entity.length() < minValue || entity.length() > maxValue) {
			return false;
		}
		return true;
	}

//	Username Validator
	public boolean userNameValidator(String userName) {
//		if (!entityValidator(userName, 3, 30)) {
//			return false;
//		}
//		return true;
		return entityValidator(userName, 3, 30);
	}

//	Password Validator 
	public boolean passwordValidator(String password) {
		if (!entityValidator(password, 3, 30)) {
			return false;
		}
		return true;
	}

//	Email Validator 
	public boolean emailValidator(String email) {
		if (!entityValidator(email, 3, 30) || !email.contains("@") || !email.contains(".")) {
			return false;
		}
		return true;
	}
}
