package com.gobeyond.question;

import java.util.Scanner;

public class GoldbachConjecture {

	public static void Goldbach(int x) {

		if (x % 2 != 0) {

			System.out.println("::Number is not even ::");

			return;
		}

		if (x <= 2) {

			System.out.println("::Number is not less than 2 ::");

			return;
		}

		for (int i = 3; i < x / 2; i++) {

			if (checkPrime(i) && checkPrime(x - i)) {

				System.out.println("Prime Numbers are " + i + " " + (x - i));
				return;
			}
		}

	}

	public static boolean checkPrime(int num) {

		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}


	public static void main(String a[]) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		GoldbachConjecture.Goldbach(t);

	}
}
