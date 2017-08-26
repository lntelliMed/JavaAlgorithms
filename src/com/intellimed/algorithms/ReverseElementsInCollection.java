package com.intellimed.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElementsInCollection {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		
		System.out.println("Before reversing, the elements in the list are " + numList);
		Collections.reverse(numList);
		System.out.println("After reversing, the elements in the list are " + numList);
		
	}

}
