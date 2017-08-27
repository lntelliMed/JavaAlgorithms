package com.intellimed.algorithms;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		System.out.println("Please enter a year to check whether it's leap or not:");

		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if (year % 4 == 0) {
			System.out.println(year + " is a leap year!");
		} else {
			System.out.println(year + " is a not leap year!");
		}
	}

}
