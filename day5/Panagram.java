package com.nithish.day5;

import java.util.HashSet;
import java.util.Set;


//ProblemLink : https://leetcode.com/problems/check-if-the-sentence-is-pangram/
class Panagram {
	public boolean checkIfPangram(String sentence) {

		Set<Character> set = new HashSet<>();
		for (char c = 'a'; c <= 'z'; c++) {
			set.add(c);
		}

		for (int i = 0; i < sentence.length(); i++) {
			Character c = sentence.charAt(i);
			if (set.contains(c)) {
				set.remove(c);
			}
		}

		if (set.isEmpty()) {
			return true;
		}

		return false;
	}
}
