package com.nithish.day11;

//ProblemLink: https://leetcode.com/problems/ransom-note
public class RansomeNote {
	public final int LETTERS_IN_ALPHABET = 26;

	public boolean canConstruct(String ransomNote, String magazine) {

		int[] frequency = new int[LETTERS_IN_ALPHABET];

		int n = magazine.length();
		for (int i = 0; i < n; i++) {
			frequency[magazine.charAt(i) - 'a']++;
		}

		n = ransomNote.length();
		for (int i = 0; i < n; i++) {
			if (--frequency[ransomNote.charAt(i) - 'a'] < 0) {
				return false;
			}
		}

		return true;
	}

}
