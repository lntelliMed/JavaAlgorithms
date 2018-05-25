package com.intellimed.secondset;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPermutations {
	public ArrayList<String> stringPermutations(String s){
		ArrayList<String> results = new ArrayList<>();
		stringPermutations("", s, results);
		return results;
	}
	
	private void stringPermutations(String prefix, String suffix, ArrayList<String> results){
		if(suffix.length() == 0){
			results.add(prefix);
		} else {
			for (int i = 0; i < suffix.length(); i++) {
				stringPermutations(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1, suffix.length()), results);
			}
		}
	}
	public ArrayList<int[]> arrayPermutations(int[] a){
		ArrayList<int[]> results = new ArrayList<>();
		arrayPermuations(a, 0, results);
		return results;
		
	}
	
	private void arrayPermuations(int[] a, int start, ArrayList<int[]> results){
		if (start >= a.length){
			results.add(a.clone());
		} else {
			for (int i = start; i < a.length; i++) {
				swap(a, start, i);
				arrayPermuations(a, start + 1, results);
				swap(a, i, start);
			}
		}
	}
	
	private void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		ListPermutations listPermutations = new ListPermutations();
		
		String sampleString = "1234";
		ArrayList<String> stringPErmutations = listPermutations.stringPermutations(sampleString);
		System.out.println(stringPErmutations.size());
		for (String string : stringPErmutations) {
			System.out.println(string);
		}
		
		int[] sampleArray = {1,2,3};
		ArrayList<int[]> arrayPErmutations = listPermutations.arrayPermutations(sampleArray);
		System.out.println(arrayPErmutations.size());
		for (int[] is : arrayPErmutations) {
			System.out.println(Arrays.toString(is));
		}
		
		
	}

}
