package com.intellimed.algorithms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter the number you want the multiplication table for:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + "x" + i + "=" + number * i);
		}
	}

}
