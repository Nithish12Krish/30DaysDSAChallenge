package com.nithish.day10;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

//ProblemLink:https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class CovertSAToBST {
	public TreeNode sortedArrayToBST(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}

	public TreeNode helper(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		int mid = left + (right - left) / 2;

		TreeNode temp = new TreeNode(nums[mid]);

		temp.left = helper(nums, left, mid - 1);
		temp.right = helper(nums, mid + 1, right);

		return temp;
	}
}
