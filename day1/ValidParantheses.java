package com.nithish.day1;

import java.util.Stack;

// Problem Link: https://leetcode.com/problems/valid-parentheses/
public class ValidParantheses {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		//loop through characters in array and check each parantheses and do operation based on it
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
}
