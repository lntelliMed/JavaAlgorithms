package com.intellimed.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupStringCharacters {

	public static void main(String[] args) {
		String origialString = "aabbbccdddd";
		
		findDupChars(origialString);
	}

	private static void findDupChars(String origialString) {
		Map charOccurences = new HashMap<>();
		char[] stringChars = origialString.toCharArray();
		for (char c : stringChars) {
			if(!charOccurences.containsKey(c)){
				charOccurences.put(c, 1);
			} else {
				charOccurences.put(c, Integer.parseInt(charOccurences.get(c).toString()) + 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = charOccurences.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() > 1){
				System.out.println(entry.getKey() + " <--> " + entry.getValue());
			}
		}
	
		
	}

}
