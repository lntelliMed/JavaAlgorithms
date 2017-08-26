package com.intellimed.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddChecker {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Integer readValue = 0;
		
		try {
			readValue = Integer.parseInt(bufferedReader.readLine());
		} catch (NumberFormatException | IOException e) {
			//e.printStackTrace();
			System.out.println("Please enter a valid number and try again!");
			System.exit(0);
		}
		
		if(readValue % 2 == 0){
			System.out.println("The number " + readValue + " is even!");
		} else {
			System.out.println("The number " + readValue + " is odd!");
		}
	}

}
