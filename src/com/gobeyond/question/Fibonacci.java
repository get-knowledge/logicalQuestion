package com.gobeyond.question;

public class Fibonacci {

	 static int a = 0, b = 1, c = 0;
	
	public static void main(String s[]) {

		for(int i=1; i<9;i++) {
			
			System.out.println(fibonacci(i));
		}
		
		

	}

	public static int fibonacci(int range) {

		if (range <= 1) {

			return range;
		} else {

			return fibonacci(range - 1) + fibonacci(range - 2);
		}

	}

	public static void printFibonacciSeries(int range) {

		int a = 0, b = 1, c = 0;

		System.out.println("fibonacci  ::" + b);

		for (int i = 2; i < range; i++) {

			c = a + b;

			a = b;
			b = c;

			System.out.println("fibonacci  ::" + c);

		}

	}

	public static void printFibonacciRescsion(int range) {

		

		if (range > 0) {
			c = a + b;

			a = b;
			b = c;

			System.out.println("fibonacci  ::" + c);
			printFibonacciRescsion(range - 1);
		}

	}

}
