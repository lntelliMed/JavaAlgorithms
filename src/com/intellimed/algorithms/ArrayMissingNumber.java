package com.intellimed.algorithms;

import java.util.Arrays;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		int[] array = {1,2,3,5,6};
		
		int missingNumber = findMissingNumber(array, 6);
		System.out.printf("The missing number in the array %s is %d", Arrays.toString(array), missingNumber);
		
	}

	private static int findMissingNumber(int[] array, int expectedLength) {
		int expectedTotal = expectedLength*(expectedLength + 1)/2;
		int actualTotal = 0;
		
		for (int i = 0; i < array.length; i++) {
			actualTotal = actualTotal + array[i];
		}
		return expectedTotal - actualTotal;
	}

}
