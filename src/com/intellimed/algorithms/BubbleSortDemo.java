package com.intellimed.algorithms;

public class BubbleSortDemo {

	public static void main(String[] args) {
		//int intArray[] = {22, 8, 4, 7, 9};
		//int intArray[] = {1, 2, 3, 4, 5};
		int intArray[] = {11111, 2222, 333, 44, 5};
		
		System.out.println("The array before bubble sorting: ");
		for (int i : intArray) {
			System.out.println(i);
		}
		long startTime = System.currentTimeMillis();
		bubbleSort(intArray);
		long endTime = System.currentTimeMillis();

		System.out.println("The array after bubble sorting (" + (endTime - startTime) + ")):");
		for (int i : intArray) {
			System.out.println(i);
		}
	}

	private static void bubbleSort(int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					int temp = 0;
					temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;

				}
			}
		}
	}
}
