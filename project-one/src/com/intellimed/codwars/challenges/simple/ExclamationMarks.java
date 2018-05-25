package com.intellimed.codwars.challenges.simple;

public class ExclamationMarks {

	public static void main(String[] args) {
		// 8kyu: Write function RemoveExclamationMarks which removes all
		// exclamation marks from a given string.

		System.out.println(Solution.removeExclamationMarks("!! Hell!o!"));
	}

}

class Solution {
	static String removeExclamationMarks(String s) {
		return s.replaceAll("!", "");
	}
}
