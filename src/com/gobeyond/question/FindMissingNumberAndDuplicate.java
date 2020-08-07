package com.gobeyond.question;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumberAndDuplicate {

	public static List<Integer> findMissingNumAndDuplicate(int arrayNum[]) {

		if (arrayNum.length == 0) {

			return new ArrayList<>();
		}

		List<Integer> missingNumber = new ArrayList<>();

		List<Integer> duplicateNumber = new ArrayList<>();

		int i = 0;
		while (i < arrayNum.length) {

			if (arrayNum[i] != arrayNum[arrayNum[i] - 1]) {

				int otherIndex = arrayNum[i] - 1;

				int temp = arrayNum[i];
				arrayNum[i] = arrayNum[otherIndex];
				arrayNum[otherIndex] = temp;

			} else {

				i++;
			}

		}

		for (i = 0; i < arrayNum.length; i++) {

			if (arrayNum[i] != i + 1) {
				missingNumber.add(i + 1);
				duplicateNumber.add(arrayNum[i]);
			}

		}
		return missingNumber;

	}

	public static void main(String a[]) {

	}

}
