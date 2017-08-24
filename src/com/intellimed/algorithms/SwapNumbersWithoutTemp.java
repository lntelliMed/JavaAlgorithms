package com.intellimed.algorithms;

public class SwapNumbersWithoutTemp {



public static void main(String[] args) {
	int a = 10;
	int b = 20;
	System.out.println("Before invoking swapWithAdd(), the values of (a,b) are: (" + a + ", " + b + ")");
	swapWithAdd(a,b);
	
	System.out.println("Before invoking swapWithMultiply(), the values of (a,b) are: (" + a + ", " + b + ")");
	swapWithMultiply(a,b);
}

private static void swapWithAdd(int a, int b) {
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("After invoking swapWithAdd(), the values of (a,b) are now: (" + a + ", " + b + ")");

}	
	
private static void swapWithMultiply(int a, int b) {
	a = a*b;
	b = a/b;
	a = a/b;
	System.out.println("After invoking swapWithMultiply(), the values of (a,b) are now: (" + a + ", " + b + ")");

}	

}
