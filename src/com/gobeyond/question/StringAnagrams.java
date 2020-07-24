package com.gobeyond.question;

import java.util.Arrays;

public class StringAnagrams {

	// Using sorting to check Anagrams

	public void checkAnagrams(String str1, String str2) {

		char strChar[] = str1.toCharArray();
		char str2Char[] = str2.toCharArray();

		Arrays.sort(strChar);// sort string

		Arrays.sort(str2Char);// sort string

		String s = new String(strChar);

		String s1 = new String(str2Char);

		if (s.equals(s1.toString())) {

			System.out.println(":: String are Anagrams :: ");
		} else {
			System.out.println(":: String are Not Anagrams :: ");

		}

	}

	public boolean isAnagrams(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		int[] counterArray = new int[256];

		for (int i = 0; i < str1.length(); i++) {

			// Increment
			counterArray[str1.charAt(i)]++;

			// Decrement
			counterArray[str2.charAt(i)]--;

		}

		for (int j = 0; j < counterArray.length; j++) {

			if (counterArray[j] != 0) {

				System.out.println(counterArray[j]);
				return false;
			}
		}

		return true;

	}

	public static void main(String a[]) {

		new StringAnagrams().checkAnagrams("helwlo", "llohe");

		if (new StringAnagrams().isAnagrams("java", "java")) {
			System.out.println("::Anagrams::");
		} else {

			System.out.println("::Not Anagrams::");
		}

	}

}
