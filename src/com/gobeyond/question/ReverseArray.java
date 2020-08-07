package com.gobeyond.question;

public class ReverseArray {

	public static int[] reverseAnArray(int[] arr, int size) {

		int temp = 0;
		if (arr.length <= 1) {

			return arr;
		} else {

			for (int i = 0; i < 2; i++) {

				temp = arr[i];

				arr[i] = arr[size - i];

				arr[size - i] = temp;

			}

			return arr;
		}

	}

	public static void main(String a[]) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		
		int[] reverseArray;

		reverseArray = reverseAnArray(array, array.length - 1);

		for (int j = 0; j < reverseArray.length; j++) {

			System.out.println(reverseArray[j]);
		}
	}
}
