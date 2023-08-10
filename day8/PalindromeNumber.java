package com.nithish.day8;

//ProblemLink: https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		int reverseX = 0;
		int temp = x;

		while (temp != 0) {
			int rem = temp % 10;
			reverseX = reverseX * 10 + rem;
			temp = temp / 10;
		}

		if (reverseX == x) {
			return true;
		} else {
			return false;
		}

	}

}
