package com.intellimed.algorithms;

public class PyramidPattern {

	public static void main(String[] args){
		int rows = 5;
		int number = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
			number = 1;
		}
	}
	
}
