package com.intellimed.algorithms;

import java.util.Scanner;

public class FahrenheitToCelsiusConverter {

	public static void main(String[] args) {
		System.out.println("Please enter the temperature (in Fahrenheit):");
		double tempFahrenheit = 0;
		Scanner scanner = new Scanner(System.in);
		
		tempFahrenheit = scanner.nextDouble();
		
		System.out.println(tempFahrenheit + " Fahrenheit is equal to " + ((tempFahrenheit - 32)*5/9) + " Celsius!");
	}

}
