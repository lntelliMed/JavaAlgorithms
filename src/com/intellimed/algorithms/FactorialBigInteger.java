package com.intellimed.algorithms;

import java.math.BigInteger;

public class FactorialBigInteger {

	public static void main(String[] args) {
		int number = 20;
//		int fact = 1;
//		for (int i = 1; i <= number; i++) {
//			fact = fact * i;
//		}
		
		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i <= number; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}

}