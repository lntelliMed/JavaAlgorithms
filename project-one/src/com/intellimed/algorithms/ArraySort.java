package com.intellimed.algorithms;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		//String[] strArray = {"one", "two", "three", "four"};
		String[] strArray = {"b", "c", "a", "z"};

		//System.out.println("Before sorting, the array elements are: " + Arrays.toString(strArray));
		System.out.println("Before sorting, the array elements are: ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(i + "--> " + strArray[i]);
		}
		
		Arrays.sort(strArray);

		System.out.println("\nAfter sorting in an ascending order, the array elements are now: ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(i + "--> " + strArray[i]);
		}
		
		Arrays.sort(strArray, Collections.reverseOrder());

		System.out.println("\nAfter sorting in descending order, the array elements are now: ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(i + "--> " + strArray[i]);
		}
	}

}
