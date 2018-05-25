package com.intellimed.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;




public class DupArrayChecker {

	public static void main(String[] args) {
		String[] dupString = new String[]{"java", "oracle", "c", "java"};
		
		List dupList = Arrays.asList(dupString);
		Set uniqueSet = new HashSet<>(dupList);
		
		if(dupList.size() != uniqueSet.size()){
			System.out.println("The array " + Arrays.toString(dupString) + " contains duplicates!");
		} else {
			System.out.println("The array " + Arrays.toString(dupString) + " does not contain duplicates!");
		}
	}

}
