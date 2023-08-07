package com.nithish.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//problemLink: https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
public class LargestpostiveIntWithItsNegative {
	public int findMaxK(int[] nums) {
		List<Integer> numbs = Arrays.stream(nums).boxed().collect(Collectors.toList());
		int k = -1;
		for (int i = 0; i < numbs.size(); i++) {
			int val = numbs.get(i);
			if (numbs.contains(val * -1)) {
				k = Math.max(k, numbs.get(i));
			}
		}

		return k;
	}

}
