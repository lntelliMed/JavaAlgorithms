package com.intellimed.secondset;

public class SwapNumbersNoTemp {
	
	public static void swapViaAdd(int x, int y){
		System.out.println("Before swapViaAdd(): (x,y) = (" + x + ", " + y + ")");
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After swapViaAdd(): (x,y) = (" + x + ", " + y + ")");

	}
	
	public static void swapViaXor(int x, int y){
		System.out.println("Before swapViaXor(): (x,y) = (" + x + ", " + y + ")");
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		System.out.println("After swapViaXor(): (x,y) = (" + x + ", " + y + ")");

	}

	public static void main(String[] args) {
		swapViaAdd(10, 20);
		swapViaXor(10, 20);
	}

}
