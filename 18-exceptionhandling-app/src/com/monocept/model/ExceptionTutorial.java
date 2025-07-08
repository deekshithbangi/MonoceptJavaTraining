package com.monocept.model;

public class ExceptionTutorial {
	public static void main(String[] args) throws ArithmeticException {

		try {
			int myInt = Integer.parseInt("hello");
		} catch (ArithmeticException ae) {
			System.out.println("Error: Division by zero is not allowed!");
		} catch (NullPointerException npe) { // Multiple exception handling
			System.out.println("Null Pointer Exception, can't take a null value");
		} catch (ArrayIndexOutOfBoundsException | ArrayStoreException e) { // we can use | (pipe) operator to separate
																			// Multiple Exceptions in single line
			System.out.println("Multiple Exception in single Catch Statement!!");
		} catch (Exception e) {
			System.out.println("Exception: Something went wrong");
		} finally {
			System.out.println("Finally Block : I'm Always Executed no matter what happens");
		}
	}
}
