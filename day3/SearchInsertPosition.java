package com.nithish.day3;

//ProblemLink : https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {

		int res = 0, l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (target < nums[mid]) {
				r = mid - 1;
				res = mid;
			} else if (target > nums[mid]) {
				l = mid + 1;
				res = mid + 1;
			} else {
				res = mid;
				break;
			}
		}
		return res;
	}

}
