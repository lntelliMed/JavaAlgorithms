package com.intellimed.algorithms;

public class SwapNumbersWithTemp {



public static void main(String[] args) {
	int a = 10;
	int b = 20;
	System.out.println("Before invoking swapNumbers(), the values of (a,b) are: (" + a + ", " + b + ")");
	swapNumbers(a,b);

}

private static void swapNumbers(int a, int b) {
	int temp = a;
	a = b;
	b = temp;
	
	System.out.println("After invoking swapNumbers(), the values of (a,b) are now: (" + a + ", " + b + ")");

}	
	


}
