package com.intellimed.algorithms;


public class FactorialNumber {

	public static void main(String[] args) {
		// ********* See also FactorialBigInteger.java ********* /
		int number = 4;
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
	}

}