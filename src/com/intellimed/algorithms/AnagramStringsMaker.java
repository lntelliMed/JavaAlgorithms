package com.intellimed.algorithms;

public class AnagramStringsMaker {
	final static int CHAR_COUNT = 26;
	public static int[] getCharCounts(String str){
		int[] charCounts = new int[CHAR_COUNT];
		
		int offset = (int) 'a';
		for (int i = 0; i < str.length(); i++) {
			charCounts[str.charAt(i) - offset]++;
			System.out.println(str.charAt(i) +  " <--> " + charCounts[str.charAt(i) - offset]);
		}
		System.out.println();
		
		return charCounts;
	}
	
	public static int findDelta(int[] arr1, int[] arr2){
		if(arr1.length != arr2.length){
			return -1; //todo: needs better error handling
		}
		
		int delta = 0;
		for (int i = 0; i < arr1.length; i++) {
			delta += Math.abs(arr1[i] - arr2[i]);
		}
		
		return delta;
	}
	
	public static void main(String[] args) {
		String str1 = "billion";
		String str2 = "hello";
		
		int[] firstStringChars = getCharCounts(str1);
		int[] secondStringChars = getCharCounts(str2);
		
		System.out.println(findDelta(firstStringChars, secondStringChars));

	}

}
