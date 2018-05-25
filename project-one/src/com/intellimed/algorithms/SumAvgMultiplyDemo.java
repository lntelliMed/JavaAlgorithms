package com.intellimed.algorithms;

import java.util.Scanner;

public class SumAvgMultiplyDemo {

	public static void main(String[] args) {
		System.out.println("Please enter a number for the type of operation you need to perform:");
		System.out.println("1 - Addition");
		System.out.println("2 - Average");
		System.out.println("3 - Multiplication");


		Scanner scanner = new Scanner(System.in);
		int operation = scanner.nextInt();
		
		System.out.println("Please now enter the numbers you want the selected operation to be performed on "
				+ "(separated by comma):");
		scanner = new Scanner(System.in);
		String[] numbersStringArray = scanner.nextLine().split(",");
		int[] numbersArray = new int[numbersStringArray.length];
		for (int i = 0; i < numbersArray.length; i++) {
			numbersArray[i] = Integer.parseInt(numbersStringArray[i].trim());
		}
		
		
		int sum = 0;
		for (int num : numbersArray) {
			sum += num;
		}
		
		switch (operation) {
		case 1:
			System.out.println("The sum of the entered numbers is: " + sum);
			break;
		case 2:
			System.out.println("The average of the entered numbers is: " + sum/numbersArray.length);
			break;
		case 3:
			System.out.print("The multiplication result is: ");
			int multiplicatinResult = 1;
			for (int num : numbersArray) {
				multiplicatinResult *= num;
			}
			System.out.println(multiplicatinResult);
			break;
		default:
			System.out.println("Undefined operation. Please try again!");
			break;
		}
	}

}
