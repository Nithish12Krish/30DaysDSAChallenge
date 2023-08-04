package com.nithish.day2;

import java.util.HashMap;
import java.util.Map;

//ProblemLink: https://leetcode.com/problems/roman-to-integer/
class RomanToInteger {
	private static final Map<Character, Integer> NUMS = new HashMap<Character, Integer>() {
		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	public int romanToInt(String s) {
		int r = 0;
		int prev = 0;

		for (char c : s.toCharArray()) {
			int v = NUMS.get(c);
			r = ((v > prev) ? r - prev + (v - prev) : r + v);
			prev = v;
		}

		return r;
	}
}
