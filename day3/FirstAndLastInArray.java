package com.nithish.day3;

//ProblemLink: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
class FirstAndLastInArray {
	public int[] searchRange(int[] nums, int target) {
		int[] ans = new int[2];
		ans[0] = firstOccurrence(nums, target);
		ans[1] = lastOccurrence(nums, target);
		return ans;
	}

	public int firstOccurrence(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int first_occ_index = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				first_occ_index = mid;
				high = mid - 1;
			} else if (nums[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return first_occ_index;
	}

	public int lastOccurrence(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int last_occ_index = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				last_occ_index = mid;
				low = mid + 1;
			} else if (nums[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return last_occ_index;
	}
}
