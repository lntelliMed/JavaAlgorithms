package com.intellimed.algorithms;

import java.util.Scanner;

public class AlphabetChecker {

	public static void main(String[] args) {

		System.out.println("Enter a character:");
		Scanner scanner = new Scanner(System.in);
		char enteredCharacter = scanner.next().charAt(0);
		
		if((enteredCharacter >= 'a' && enteredCharacter <= 'z') || (enteredCharacter >= 'A' && enteredCharacter <= 'Z')){
			System.out.println("The entered character " + enteredCharacter + " is an alphabet!");
		} else {
			System.out.println("The entered character " + enteredCharacter + " is not an alphabet!");
		}
	}

}
