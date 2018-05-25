package com.intellimed.algorithms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupsInString {

	public static void main(String[] args) {
		String dupString = "java";
		System.out.println(removeDuplicates(dupString));

		dupString = "sameer";
		System.out.println(removeDuplicates(dupString));	
	}

	private static String removeDuplicates(String dupString) {
		char[] stringChars = dupString.toCharArray();
		
		Set<Character> charSet = new HashSet<>();
		StringBuffer stringBuffer = new StringBuffer();
		for (char c : stringChars) {
			if(!charSet.contains(c)){
				charSet.add(c);
				stringBuffer.append(c);
			}
		}
		return stringBuffer.toString();
	}

}
