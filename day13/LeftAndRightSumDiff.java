package com.nithish.day13;

public class LeftAndRightSumDiff {
	public int[] leftRigthDifference(int[] nums) {

		int[] leftSum = new int[nums.length];
		int[] rightSum = new int[nums.length];

		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			leftSum[i] = 0;
			rightSum[i] = 0;
			for (int j = 0; j < i; j++) {
				leftSum[i] += nums[j];
			}

			for (int k = i + 1; k < nums.length; k++) {
				rightSum[i] += nums[k];
			}
		}

		for (int i = 0; i < nums.length; i++) {

			result[i] = Math.abs(leftSum[i] - rightSum[i]);
		}

		return result;

	}
}
