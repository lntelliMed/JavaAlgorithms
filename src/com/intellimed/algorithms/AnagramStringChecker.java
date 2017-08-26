package com.intellimed.algorithms;

import java.util.Arrays;

public class AnagramStringChecker {

	public static void main(String[] args) {
		String firstString = "java1";
		//String seconSdtring = "avaj";
		String seconSdtring = "aajv";

		
		if(isAnagram(firstString, seconSdtring)){
			System.out.println("The strings " + firstString + " and "  + seconSdtring + " are anagrams (using first method \"isAnagram()\")!");
		} else {
			System.out.println("The strings " + firstString + " and "  + seconSdtring + " are not anagrams (using first method \"isAnagram()\")!");
		}

		if(isAnagram(firstString, seconSdtring)){
			System.out.println("The strings " + firstString + " and "  + seconSdtring + " are anagrams (using second method \"isAnagramWithStringBuilder()\")!");
		} else {
			System.out.println("The strings " + firstString + " and "  + seconSdtring + " are not anagrams (using second method \"isAnagramWithStringBuilder()\")!");
		}
	}

	private static boolean isAnagram(String firstString, String seconSdtring) {
		char[] charsForFirstString = firstString.toCharArray();
		char[] charsForSecondString = seconSdtring.toCharArray();

		Arrays.sort(charsForFirstString);
		Arrays.sort(charsForSecondString);
		return Arrays.equals(charsForFirstString, charsForSecondString);
	}

	
	private static boolean isAnagramWithStringBuilder(String firstString, String seconSdtring) {
		char[] charsForFirstString = firstString.toCharArray();
		StringBuilder stringBuilder = new StringBuilder(seconSdtring);
		
		for (char c : charsForFirstString) {
			int foundCharIndex = stringBuilder.indexOf(String.valueOf(c)) ;
			if(foundCharIndex != -1){
				stringBuilder.deleteCharAt(foundCharIndex);
			}
		}
		return stringBuilder.length() == 0;
	}
}
