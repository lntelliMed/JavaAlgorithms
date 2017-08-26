package com.intellimed.algorithms;

public class NumberReverse {

	public static void main(String[] args) {
		int num = 123;
		
		String numAsString = String.valueOf(num);
		String reverseString = "";
		for (int i = numAsString.length() - 1; i >= 0; i--) {
			reverseString += numAsString.charAt(i);
		}
		
		System.out.println(Integer.valueOf(reverseString));
	}

}
