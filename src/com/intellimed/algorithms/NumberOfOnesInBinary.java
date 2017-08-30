package com.intellimed.algorithms;

public class NumberOfOnesInBinary {
	// O(log(x))
	public int ones(int x){
		int sum = 0;
		while(x > 0){
			//sum += x % 2;
			sum += x & 1;
			x >>= 1;
			//System.out.println(x);
		}
		return sum;
	}
	public static void main(String[] args) {
		int x = 8;
		NumberOfOnesInBinary numberOfOnesInBinary = new NumberOfOnesInBinary();
		System.out.println("Number of ones in " + x + " is: " + numberOfOnesInBinary.ones(x));
	}

}
