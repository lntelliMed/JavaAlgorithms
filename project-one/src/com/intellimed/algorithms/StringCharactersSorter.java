package com.intellimed.algorithms;

import java.util.Arrays;

public class StringCharactersSorter {

	public static void main(String[] args) {
		String originalString = "java";
		char[] originalStringChars = originalString.toCharArray();
		Arrays.sort(originalStringChars);
		String sortedString = new String(originalStringChars);
		
		System.out.println("Original String: " + originalString + " <--> " + "Sorted String: " + sortedString);
	}

}
