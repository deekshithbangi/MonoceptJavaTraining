package com.monocept.exceptions;

public class InsufficentFundsException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Your Account has Insufficent Balance";
	}
}