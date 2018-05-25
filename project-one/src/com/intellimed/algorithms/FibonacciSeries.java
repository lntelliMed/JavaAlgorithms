package com.intellimed.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int seriesLength = 0;
		System.out.println("Please enter the desired length of the Fibonacci Series to be generated:");
		Scanner scanner = new Scanner(System.in);
		seriesLength = scanner.nextInt();
		
		int fibonacciSeries[] = new int[seriesLength];
		
		fibonacciSeries[0] = 0;
		fibonacciSeries[1] = 1;
		
		for (int i = 2; i < fibonacciSeries.length; i++) {
			fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
		}
		
		//System.out.println("Fibonacci Series Elements of Size " + seriesLength +" are: " + Arrays.toString(fibonacciSeries));
		
		System.out.println("Fibonacci Series Elements of Size " + seriesLength +" are: ");
		
		for (int i : fibonacciSeries) {
			System.out.println(i);
		}
	}

}
