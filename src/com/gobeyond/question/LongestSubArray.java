package com.gobeyond.question;

public class LongestSubArray {

	public static int longestSubArrayWith1s(int[] arr, int k) {

		if (arr == null || arr.length < 0 || k <= 0 || k > arr.length) {

			return -1;
		}

		int start = 0, end = 0, maxlength = 0, numberOfZero = 0;

		while (end < arr.length) {

			if (arr[end] == 0) {
				numberOfZero++;
			}

			if (numberOfZero > k) {

				if (arr[start] == 0) {
					numberOfZero--;

				}
				start++;
			}

			maxlength = Math.max(end - start + 1, maxlength);

			end++;
		}

		return maxlength;
	}

	public static void main(String a[]) {

		int[] array = { 0, 1, 0, 1, 0, 1, 1, 1, 0 };
		int k = 2;

		System.out.println(longestSubArrayWith1s(array, k));

	}

}
