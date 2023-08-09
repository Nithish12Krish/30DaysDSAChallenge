package com.nithish.day7;

//ProblemLink : https://leetcode.com/problems/sign-of-the-product-of-an-array/
public class signOfProductArray {
	public int arraySign(int[] nums) {

		int negCount = 0;

		for (int n : nums) {
			if (n < 0)
				negCount++;
			if (n == 0)
				return 0;
		}

		return negCount % 2 == 0 ? 1 : -1;

	}

}
