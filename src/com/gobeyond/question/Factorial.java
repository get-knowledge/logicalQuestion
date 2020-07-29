package com.gobeyond.question;

public class Factorial {

	public static int calculateFactorial(int num) {

		if (num == 0)
			return 1;

		else {

			return num * calculateFactorial(num - 1);
		}
	}

	public static void main(String a[]) {
		System.out.println(calculateFactorial(7));

	}

}
