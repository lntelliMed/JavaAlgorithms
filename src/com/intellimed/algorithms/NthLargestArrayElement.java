package com.intellimed.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargestArrayElement {

	public static void main(String[] args) {
		System.out.println("Enter which largest element you need to display in the following array (e.g. 2):");
		int[] array = {5,3,8,22,9};
		for (int i : array) {
			System.out.println(i);
		}
		Scanner scanner = new Scanner(System.in);
		int elementNumber = scanner.nextInt();
		
		Arrays.sort(array);
		
		System.out.println("The " + elementNumber + "(st/nd/rd/th) largest element in the array is: " + array[array.length - elementNumber]);
	}

}
