package com.nithish.day7;

//ProblemLink :https://leetcode.com/problems/max-consecutive-ones/
public class MostConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {

		int result = 0;
		int counter = 0;

		for (int i = 0; i < nums.length; i++) {

			counter = (nums[i] == 1) ? counter + 1 : 0;
			result = Math.max(result, counter);
		}

		return result;

	}

}
