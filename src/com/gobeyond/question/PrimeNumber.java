package com.gobeyond.question;

public class PrimeNumber {

	public static boolean checkPrmimeNumber(int num) {

		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {
				return false;
			}

		}
		return true;

	}
	
	public static void main(String a[]) {
		
		System.out.println(checkPrmimeNumber(13));
	}

}
