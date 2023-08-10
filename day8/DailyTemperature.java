package com.nithish.day8;

import java.util.Stack;

//ProblemLink: https://leetcode.com/problems/daily-temperatures
public class DailyTemperature {
	public int[] dailyTemperatures(int[] temperatures) {

		Stack<Integer> stack = new Stack<>();
		int ans[] = new int[temperatures.length];

		for (int i = 0; i < temperatures.length; i++) {

			if (stack.size() == 0 || temperatures[stack.peek()] >= temperatures[i]) {
				stack.push(i);
			} else {
				while (stack.size() > 0 && temperatures[stack.peek()] < temperatures[i]) {
					int last = stack.pop();
					ans[last] = i - last;

				}

				stack.push(i);
			}
		}

		return ans;

	}

}
