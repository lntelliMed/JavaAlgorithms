package com.intellimed.datastructures.linear;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int[] arr = {3, 6, 1, 9, 2, 88};
		System.out.println("Array before sorting: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array after sorting: " + Arrays.toString(arr));
		
		int num = 2;
		System.out.println("Does the number " + num +" exist in the array " + Arrays.toString(arr) + "? "+ binarySearch(arr, num) );
		
		num = 5;
		System.out.println("Does the number " + num +" exist in the array " + Arrays.toString(arr) + "? "+ binarySearch(arr, num) );
	}

	private static boolean binarySearch(int[] arr, int num) {
		int startIndex = 0;
		int endIndex = arr.length - 1;
		
		
		while(startIndex <= endIndex){
			int midPoint = (endIndex + startIndex) / 2;
			if (num == arr[midPoint]){
				System.out.println("1 ---> " + startIndex + "--" + endIndex +"--" + midPoint);
				return true;
			}
			if (num < arr[midPoint]) {
				System.out.println("2 ---> " + startIndex + "--" + endIndex +"--" + midPoint);

				endIndex = midPoint - 1;
			} else {
				System.out.println("3 ---> " + startIndex + "--" + endIndex +"--" + midPoint);

				startIndex = midPoint + 1;
			}
		}
		
		return false;
	}

}
