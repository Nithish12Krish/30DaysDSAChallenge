package com.nithish.day9;

//ProblemLink: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class IndexOfFirstOccurenceString {
	public int strStr(String haystack, String needle) {
		int m = needle.length();
		int n = haystack.length();

		for (int windowStart = 0; windowStart <= n - m; windowStart++) {

			for (int i = 0; i < m; i++) {
				if (needle.charAt(i) != haystack.charAt(windowStart + i)) {
					break;
				}
				if (i == m - 1) {
					return windowStart;
				}
			}
		}
		return -1;

	}

}
