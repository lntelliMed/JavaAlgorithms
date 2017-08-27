package com.intellimed.algorithms;


public class FactorialNumber {

	public static void main(String[] args) {
		// ********* See also FactorialBigInteger.java ********* /
		int number = 3;
		
		int fact = findFactorialWithLoop(number);		
		System.out.println("Factorial of number " + number + " using \"findFactorialWithLoop()\" is " + fact);
		
		fact = findFactorialWithRecursion(number);	
		System.out.println("Factorial of number " + number + " using \"findFactorialWithRecursion()\" is " + fact);
	}

	private static int findFactorialWithLoop(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
//	private static int findFactorialWithRecursion(int number) {
//		int fact = 1;
//		if(number>=1){
//			fact = number * findFactorialWithRecursion(number-1);
//		}
//		return fact;
//	}

	private static int findFactorialWithRecursion(int number) {
		if(number == 0){
			return 1;
		}
		return number * findFactorialWithRecursion(number - 1);
	}
}