package com.intellimed.algorithms;

import java.util.Scanner;

public class PalindromeStringChecker {

	// See also ReverseString.java and NumberReverse.java!
	public static void main(String[] args) {
		System.out.println("Please enter a string:");
		Scanner scanner = new Scanner(System.in);
		String originalString = scanner.nextLine();
		String reverseString = "";
		
		for (int i = originalString.length() - 1; i >= 0; i--) {
			reverseString += originalString.charAt(i);
		}
		
		if (originalString.equals(reverseString)) {
			System.out.println("The string " + originalString + " is palindrome as the reverse is " + reverseString);
		} else {
			System.out.println("The string " + originalString + " is not palindrome as the reverse is " + reverseString);
		}
		
	}

}
