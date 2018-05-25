package com.intellimed.algorithms;

import java.util.Scanner;

public class LargestNumberDemo {

	public static void main(String[] args) {
		System.out.println("Enter three distinct numbers:");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		if(x > y && x > z){
			System.out.println("The number " + x + " is the largest in the set: (" + x + ", " + y + ", " + z + ")");
		} else if(y > x && y > z){
			System.out.println("The number " + y + " is the largest in the set: (" + x + ", " + y + ", " + z + ")");
		} else if(z > x && z > y){
			System.out.println("The number " + z + " is the largest in the set: (" + x + ", " + y + ", " + z + ")");
		}

	}

}
