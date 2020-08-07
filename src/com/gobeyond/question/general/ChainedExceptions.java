package com.gobeyond.question.general;

public class ChainedExceptions {

	public static void main(String[] args) {
		try {
			// Creating an exception
			NumberFormatException ex = new NumberFormatException("Exception");

			// Setting a cause of the exception
			ex.initCause(new NullPointerException("This is actual cause of the exception"));

			// Throwing an exception with cause.
			throw ex;
		}

		catch (NumberFormatException ex) {
			// displaying the exception
			System.out.println(ex);

			// Getting the actual cause of the exception
			System.out.println(ex.getCause());
		}

		try {
			System.out.printf("1");
			int sum = 9 / 0;
			System.out.printf("2");
		} catch (ArithmeticException e) {
			System.out.printf("3");
		} catch (Exception e) {
			System.out.printf("4");
		} finally {
			System.out.printf("5");
		}

	}
}
