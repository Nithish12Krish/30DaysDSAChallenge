package com.nithish.day4;

//ProblemLink: https://leetcode.com/problems/goal-parser-interpretation/
class GoalParser {
	public String interpret(String command) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == 'G') {
				sb.append("G");
			}
			if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
				sb.append("o");
			}
			if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
				sb.append("al");
			}
		}

		return sb.toString();
	}
}
