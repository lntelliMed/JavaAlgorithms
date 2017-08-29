package com.intellimed.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKey {

	public static void main(String[] args) {
		Map<String, String> unsortedMap = new HashMap<>();
		unsortedMap.put("apple", "apple");
		unsortedMap.put("pineapple", "pineapple");
		unsortedMap.put("banana", "banana");
		unsortedMap.put("guava", "guava");

		System.out.println("Before sorting, the key-value pairs stored in the HashMap are: ");
		for (Map.Entry<String, String> entry : unsortedMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		Map<String, String> sortedMap = new TreeMap<>(unsortedMap);
		System.out.println("\nAfter sorting, the key-value pairs stored in the TreeMap are: ");
		for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

}
