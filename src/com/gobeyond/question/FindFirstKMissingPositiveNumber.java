package com.gobeyond.question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFirstKMissingPositiveNumber {

	public static List<Integer> findFirstKMissingPN(int arr[], int k) {

		if (arr.length < 0 || k < 1) {

			new ArrayList<>();
		}

		int i = 0;
		while (i < arr.length) {

			if (arr[i] > 0 && arr[i] <= arr.length && (arr[i] != arr[arr[i]-1])) {

				int otherIndex = arr[i] - 1;
				int temp = arr[i];

				arr[i] = arr[otherIndex];
				arr[otherIndex] = temp;

			} else {

				i++;
			}

		}

		List<Integer> missingNumber = new ArrayList<>();

		Set<Integer> otherNumber = new HashSet<>();

		for (int j = 0; j < arr.length && missingNumber.size() < k; j++) {

			if (arr[j] != j + 1) {
				missingNumber.add(j + 1);
				otherNumber.add(arr[j]);
			}
		}

		/*
		 * for (int l = 0; l < otherNumber.size(); l++) {
		 * 
		 * if (!otherNumber.contains(l + 1)) {
		 * 
		 * missingNumber.add(l + 1); }
		 * 
		 * }
		 */

		return missingNumber;
	}

	public static void main(String a[]) {
		
		int arraNum[] = {-2,1,5,6,11,8,10};
		
		findFirstKMissingPN(arraNum,3).forEach(num ->{
			
			System.out.println("Missing Number ::"+num);
		});
	}
	
	
}
