package com.intellimed.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		System.out.println("Please enter the size of the array you want to calculate the sum for:");
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		
		int[] arrayElements = new int[arraySize];
		
		System.out.println("\nNow, please enter the values of the array elements "
				+ "(total should be " + arraySize + " elements):");
		for (int i = 0; i < arrayElements.length; i++) {
			arrayElements[i] = scanner.nextInt();
		}
		
		int sum = 0;
		for (int i : arrayElements) {
			sum += i;
		}
		
		System.out.println("The sum of the elements " + Arrays.toString(arrayElements) + " is: " + sum);
	}

}
