package com.gobeyond.question;

public class ReverseString {

	public static String reverseString(String str) {

		if (str == null || str.isEmpty())

			return str;

		else {

			return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
		}

	}

	public static void main(String a[]) {
		
		System.out.println(reverseString("hello"));
		
	}
	
}
