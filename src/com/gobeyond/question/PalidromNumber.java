package com.gobeyond.question;

public class PalidromNumber {

	public static void checkPalidromNum(int num) {

		int sum = 0;
		int k = num;

		while (num > 0) {

			int r = num % 10;

			sum = sum*10+r;

			num = num / 10;

		}

		if (sum == k) {
			System.out.println("ok");
		} else {
			System.out.println("not ok");
		}

	}
	
	public static void main(String a[]) {
		
		
		checkPalidromNum(1901);
		
	}

}
