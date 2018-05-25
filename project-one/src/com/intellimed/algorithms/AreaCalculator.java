package com.intellimed.algorithms;

public class AreaCalculator {

	public static void main(String[] args) {
		double rectArea = findRetangleArea(10, 20);
		System.out.println("The area of the rectangle is: " + rectArea);
		
		double  circArea = findCircleArea(3);
		System.out.println("The area of the circle is: " + circArea);
		
		double  circCircumference = findCircleCircumference(3);
		System.out.println("The circumference  of the circle is: " + circCircumference);
	}

	private static double findCircleCircumference(double radius) {
		return 2*radius*Math.PI;
	}

	private static double findCircleArea(double radius) {
		return Math.PI * (radius*radius);
	}

	private static double findRetangleArea(double length, double width) {
		
		return length*width;
	}

}
