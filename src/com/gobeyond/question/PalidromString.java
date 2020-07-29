package com.gobeyond.question;

public class PalidromString {

	public static String chekcStringIsPalidrom(String str) {

		if (str == null || str.isEmpty())

			return str;

		else {

			return str.charAt(str.length() - 1) + chekcStringIsPalidrom(str.substring(0, str.length() - 1));
		}

	}

	public static void main(String a[]) {
		
		
		
		
		System.out.println(chekcStringIsPalidrom("Hello"));
		
		
	}
	
}
