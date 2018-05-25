package com.intellimed.codwars.challenges.simple;

public class NumberAverages {
	/*
	 * Write function avg which calculates average of numbers in given list.
	 */
	public static void main(String[] args) {
		int[] input = { 100, 101, 5, 5, 1, 1 };
		System.out.println(Kata3.find_average(input));

	}
}

class Kata3 {
	public static double find_average(int[] array) {
		double sum = 0;
		for (int i : array) {
			sum = sum + i;
		}
		return sum / array.length;

	}
}
