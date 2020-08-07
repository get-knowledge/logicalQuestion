package com.gobeyond.question;

public class StringClass {

	public static void splitString(String str) {

		String[] splitterString = str.split("\"");
		for (String s : splitterString) {
			System.out.println(s);
		}

	}

	public static void main(String a[]) {

		String str = "Do this at \"2014-09-16 05:40:00.0\" adf \" asdfasd asdfasdf fasd\" adsf";
		
		StringClass.splitString(str);
	}

}
