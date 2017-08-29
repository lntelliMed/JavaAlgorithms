package com.intellimed.algorithms;

import java.util.Arrays;

public class ArrayMinMax {

	public static void main(String[] args) {
		int intArray[] = {2,1,5,33,100};
		int minNumber = Integer.MAX_VALUE;
		int maxNumber = Integer.MIN_VALUE;
		
		
		for (int i : intArray) {
			if(minNumber > i){
				minNumber = i;
			}
			
			if(maxNumber < i){
				maxNumber = i;
			}
		}
		
		System.out.println("The min and max values in the array " + Arrays.toString(intArray) +" are: " 
				+ minNumber + " and " + maxNumber + ", respectively.");
	}

}
