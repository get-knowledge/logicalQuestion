package com.gobeyond.question;

public class CyclicSortInArray {

	public static void cyclicSort(int arra[]) {

		if (arra.length < 1) {

			return;
		}
		int i = 0;
		while (i < arra.length) {

			if (arra[i] != i + 1) {

				int destination = arra[i] - 1;
				int x = arra[i];

				arra[i] = arra[destination];

				arra[destination] = x;

			} else {
				i++;
			}

		}
		
		

	}
	
	public static void main(String a[]) {
		
		int arr[] = {1,2,5,4,6,3};
		
		CyclicSortInArray.cyclicSort(arr);
		
		for(int j:arr) {
			
			System.out.println(j);
		}
	}

}
