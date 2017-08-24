package com.intellimed.algorithms;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class FloydsTriangle {
	public static void main(String[] args) {
		System.out.println("Please enter the number of rows:");
		Scanner scanner = new Scanner(System.in);
		
		int rows = scanner.nextInt();
		int number = 1;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}
}
