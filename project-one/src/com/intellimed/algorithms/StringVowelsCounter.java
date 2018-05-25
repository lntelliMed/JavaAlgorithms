package com.intellimed.algorithms;

import java.util.Scanner;

public class StringVowelsCounter {

	public static void main(String[] args) {
		System.out.println("Please enter a string:");
		Scanner scanner = new Scanner(System.in);
		String enteredString = scanner.next();
		char[] enteredStringChars = enteredString.toCharArray();
		
		//char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		int counter = 0;
		for (char c : enteredStringChars) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				counter++;
			}
			
/*			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				counter++;
				break;
			}*/
		}
		
		System.out.println("The string " + enteredString + " contains " + counter + " vowels!");
		
	}

}
