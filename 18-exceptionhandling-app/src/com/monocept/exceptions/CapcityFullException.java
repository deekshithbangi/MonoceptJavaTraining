package com.monocept.exceptions;

public class CapcityFullException extends RuntimeException {
	public String getMessage() {
		return "Oops! The movie list is at full capacity. You can't add more movies at the moment.";
	}
}
