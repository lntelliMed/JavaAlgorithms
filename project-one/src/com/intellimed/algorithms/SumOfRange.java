package com.intellimed.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfRange {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Integer rangeStart = 0;
		Integer rangeEnd = 0;

		try {
			System.out.println("Please enter the range starting number");
			rangeStart = Integer.parseInt(bufferedReader.readLine());
			
			System.out.println("Please enter the range ending number");
			rangeEnd = Integer.parseInt(bufferedReader.readLine());

		} catch (NumberFormatException | IOException e) {
			//e.printStackTrace();
			System.out.println("Please provide a valid number!");
			System.exit(0);
		}
		
		int sumOfRange = 0;
		
		for (int i = rangeStart; i <= rangeEnd ; i++) {
			sumOfRange += i;
		}
		
		System.out.println("The sum of numbers in the range " + rangeStart + " - " + rangeEnd + " (inclusive) is: " + sumOfRange);
		
	}

}
