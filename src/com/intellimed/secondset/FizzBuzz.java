package com.intellimed.secondset;

public class FizzBuzz {
	public void fizzBuzz(int x){
		
		for (int i = 1; i <= x; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0){
				System.out.println("Fizz");
			}else if(i % 5 == 0){
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
				
		}
		
	}
	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.fizzBuzz(15);
	}

}
