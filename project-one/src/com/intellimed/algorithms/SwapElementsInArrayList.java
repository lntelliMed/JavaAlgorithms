package com.intellimed.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElementsInArrayList {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);

		System.out.println("Before swapping, the elements in the ArrayList are: " + numList);
		Collections.swap(numList, 1, 2);
		System.out.println("After swapping, the elements in the ArrayList are: " + numList);

		
		
	}
}
