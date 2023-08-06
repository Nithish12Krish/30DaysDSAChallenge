package com.nithish.day4;

// Definition for a binary tree node.
//Problem Link : https://leetcode.com/problems/search-in-a-binary-search-tree
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

class SearchInBST {
	public TreeNode searchBST(TreeNode root, int val) {

		if (root == null || root.val == val)
			return root;

		else if (val < root.val)
			return searchBST(root.left, val);

		return searchBST(root.right, val);

	}
}
