package com.nithish.day12;

//ProblemLink: https://leetcode.com/problems/richest-customer-wealth
public class RichestCustomerWealth {
	public int maximumWealth(int[][] accounts) {

		int solu = 0;

		for (int i = 0; i < accounts.length; i++) {
			int max = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				max += accounts[i][j];
			}

			solu = (max > solu) ? max : solu;
		}
		return solu;

	}

}
