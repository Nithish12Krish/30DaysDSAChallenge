package com.nithish.day11;

import java.util.ArrayList;
import java.util.List;

//ProblemLink:https://leetcode.com/problems/fizz-buzz
public class FizzBuzz {
	public List<String> fizzBuzz(int n) {

		List<String> solu = new ArrayList<>();

		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				solu.add("FizzBuzz");
			} else if (i % 3 == 0) {
				solu.add("Fizz");
			} else if (i % 5 == 0) {
				solu.add("Buzz");
			} else {
				solu.add("" + i + "");
			}

		}

		return solu;

	}
}
