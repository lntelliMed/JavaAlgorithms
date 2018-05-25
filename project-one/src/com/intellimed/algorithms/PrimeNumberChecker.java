package com.intellimed.algorithms;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		System.out.println("Please enter the number you need to check whether it's a prime number or not:");
		Scanner scanner = new Scanner(System.in);
		
		int numberToCheck = scanner.nextInt();
		
		boolean isPrime = true;
		
		for (int i = 2; i < numberToCheck; i++) {
			if(numberToCheck % i ==0){
				isPrime = false;
				break;
			}
		}
	
		if (isPrime) {
			System.out.println(numberToCheck + " is a prime number!");
		} else {
			System.out.println(numberToCheck + " is not a prime number!");
		}
	
	}

}
