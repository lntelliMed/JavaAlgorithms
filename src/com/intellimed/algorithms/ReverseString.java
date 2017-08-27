package com.intellimed.algorithms;

import java.util.Scanner;

public class ReverseString {
	// See also NumberReverse.java
	public static void main(String[] args) {
		System.out.println("Please enter a string:");
		Scanner scanner = new Scanner(System.in);
		String originalString = scanner.nextLine();
		String reverseString = "";
		
		for (int i = originalString.length() - 1; i >= 0 ; i--) {
			reverseString += originalString.charAt(i);
		}
		
		System.out.println("After reversing, the string " + originalString + " becomes " + reverseString);
	}

}
