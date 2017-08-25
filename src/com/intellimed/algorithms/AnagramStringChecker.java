package com.intellimed.algorithms;

import java.util.Arrays;

public class AnagramStringChecker {

	public static void main(String[] args) {
		String firstString = "java";
		//String seconSdtring = "avaj";
		String seconSdtring = "aajv";

		
		if(isAnagram(firstString, seconSdtring)){
			System.out.println("The strings " + firstString + " and "  + seconSdtring + " are anagrams!");
		} else {
			System.out.println("The strings " + firstString + " and "  + seconSdtring + " are not anagrams!");
		}

		
	}

	private static boolean isAnagram(String firstString, String seconSdtring) {
		char[] charsForFirstString = firstString.toCharArray();
		char[] charsForSecondString = seconSdtring.toCharArray();

		Arrays.sort(charsForFirstString);
		Arrays.sort(charsForSecondString);
		return Arrays.equals(charsForFirstString, charsForSecondString);
	}

}
