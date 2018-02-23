package com.intellimed.algorithms;

class EvenlySpaced {

	public boolean evenlySpaced(int a, int b, int c) {
		if (a == b && b == c)
			return true;
		if (a == b || a == c || b == c)
			return false;
		return ((Math.abs(a - b) == Math.abs(b - c)) || (Math.abs(a - c) == Math.abs(a - b))
				|| (Math.abs(c - a) == Math.abs(b - c)));
	}

};
