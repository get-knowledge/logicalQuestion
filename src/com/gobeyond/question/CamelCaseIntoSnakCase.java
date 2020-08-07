package com.gobeyond.question;

public class CamelCaseIntoSnakCase {

	public static String convert(String str) {

		StringBuilder strBuilder = new StringBuilder();

		for (char ch : str.toCharArray()) {

			if (Character.isUpperCase(ch)) {
				
				strBuilder.append('-').append(Character.toLowerCase(ch));
			} else {
				strBuilder.append(Character.toLowerCase(ch));
			}

		}
		return strBuilder.toString().substring(1,strBuilder.toString().length());

	}

	public static void main(String[] args) {

		System.out.println(CamelCaseIntoSnakCase.convert("ChamelCasefasfDHsfsjwje"));
		
	}

}
