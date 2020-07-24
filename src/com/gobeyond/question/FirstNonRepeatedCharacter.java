package com.gobeyond.question;

import java.util.HashMap;

public class FirstNonRepeatedCharacter {

	HashMap<Character, Integer> strCountMap = new HashMap<>();

	public HashMap<Character, Integer> findNonReapeatinChar(String str) {

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (strCountMap.containsKey(ch)) {

				strCountMap.put(ch, strCountMap.get(ch) + 1);
			} else {

				strCountMap.put(ch, 1);
			}
		}

		return strCountMap;
	}

	public static void main(String a[]) {

		String srt = "helloworld";

		HashMap<Character, Integer> strCountMap = new FirstNonRepeatedCharacter().findNonReapeatinChar(srt);

		for (int i = 0; i < srt.length(); i++) {

			char ch = srt.charAt(i);

			if (strCountMap.get(ch) == 1) {

				System.out.println(ch);
				break;
			}
		}

	}

}
