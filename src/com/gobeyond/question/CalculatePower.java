package com.gobeyond.question;

public class CalculatePower {

	public static int calPower(int num, int pow) {

		if (pow == 0) {

			return num;
		} else {
			return num * calPower(num, --pow);
		}

	}

	public static void main(String a[]) {

		System.out.println(CalculatePower.calPower(4, 2));
	}

}
