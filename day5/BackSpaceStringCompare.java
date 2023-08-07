package com.nithish.day5;

//ProblemLink: https://leetcode.com/problems/backspace-string-compare/
class BackSpaceStringCompare {
	// Optimal solution
	public boolean backspaceCompare(String S, String T) {
		int p1 = S.length() - 1;
		int p2 = T.length() - 1;

		// loop through to both Strings
		while (p1 >= 0 || p2 >= 0) {

			// loop through first String check char is # and backCount >0
			int backCountS = 0;
			while (p1 >= 0 && (S.charAt(p1) == '#' || backCountS > 0)) {
				if (S.charAt(p1) == '#') {
					backCountS++;
				} else {
					backCountS--;
				}
				p1--;
			}

			// loop through second String check char is # and backCount >0
			int backCountT = 0;
			while (p2 >= 0 && (T.charAt(p2) == '#' || backCountT > 0)) {
				if (T.charAt(p2) == '#') {
					backCountT++;
				} else {
					backCountT--;
				}
				p2--;
			}

			// After check 2 strings char at same level
			if (p1 >= 0 && p2 >= 0 && S.charAt(p1) != T.charAt(p2)) {
				return false;
			}
			// check any of the strings have letters still
			else if ((p1 >= 0) != (p2 >= 0)) {
				return false;
			}

			p1--;
			p2--;
		}

		return true;
	}

}
