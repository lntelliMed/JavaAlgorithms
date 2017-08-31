package com.intellimed.secondset;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println(compress("aabbbcdddedd"));
		System.out.println(compress("a"));
		System.out.println(compress("aaabbbccccc"));
		System.out.println(compress("aaa"));



	}

	private static String compress(String string) {
		String out = "";
		int sum = 1;
		
		for (int i = 0; i < string.length() - 1; i++) {
			if(string.charAt(i) == string.charAt(i + 1)){
				sum++;
			} else {
				//out += string.charAt(i) + sum; //this won't work as we need to force casting to string during addition!
				out = out + string.charAt(i) + sum;
				sum = 1;
			}
		}
		
		out = out + string.charAt(string.length() - 1) + sum;
		//System.out.println(out.length() + " - " + string.length());
		//System.out.println(out + " - " + string);

		return out.length() < string.length() ? out : string;
	}

}
