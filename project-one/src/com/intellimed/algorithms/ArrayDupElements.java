package com.intellimed.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDupElements {

	public static void main(String[] args) {
		String[] dupValues = {"Java", "Hibernate", "Spring Boot", "Java", "Spring", "Spring Boot"};
		Set dupSet = new HashSet<>();
		Set nonDupSet = new HashSet<>();

		
		for (String string : dupValues) {
			if(!nonDupSet.contains(string)){
				nonDupSet.add(string);
			} else {
				dupSet.add(string);
			}
		}
		System.out.println("The dup elements found in " + Arrays.toString(dupValues) + " are:\n");
		System.out.println(dupSet);
	}

}
