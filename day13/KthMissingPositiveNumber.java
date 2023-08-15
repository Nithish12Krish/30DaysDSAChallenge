package com.nithish.day13;

//ProblemLink:https://leetcode.com/problems/kth-missing-positive-number/
public class KthMissingPositiveNumber {
	public int findKthPositive(int[] arr, int k) {
		for (int i : arr) {
			if (i <= k)
				k++;
			else
				break;
		}
		return k;
	}
}
