package com.intellimed.algorithms;

import java.util.Scanner;

public class FactorOfNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		
		//Scanner scanner = new Scanner(System.in);
		//int number = scanner.nextInt();
		int maxNumber = 100;
		for (int i = 1; i <= maxNumber; i++) {
			System.out.println("The factors of the number " + i + " are:");
			
			for (int j = 1; j <= i; j++) {
				if(i % j == 0){
					System.out.println(j);
				}
				
			}
		}

	}

}
