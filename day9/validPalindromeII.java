package com.nithish.day9;

//ProblemLink: https://leetcode.com/problems/valid-palindrome-ii/
public class validPalindromeII {
	public boolean validSubPalindrome(String s, int left, int right) {
		while (left <= right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public boolean validPalindrome(String s) {

		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int left = 0;
		int right = s.length() - 1;

		while (left <= right) {
			if (s.charAt(left) != s.charAt(right)) {
				return validSubPalindrome(s, left + 1, right) || validSubPalindrome(s, left, right - 1);
			}
			left++;
			right--;
		}

		return true;
	}

}
