package com.nithish.day14;

public class KokoEatBanana {
	public int minEatingSpeed(int[] piles, long h) {

		int maxPile = 0;
		for (int p : piles) {
			maxPile = Math.max(p, maxPile);
		}

		int l = 1, r = maxPile;
		int ans = r;
		while (l <= r) {
			int mid = (l + r) / 2;

			long hours = 0;
			for (int p : piles) {

				hours += (int) Math.ceil(p / (double) mid);

			}

			System.out.println(hours);

			if (hours <= h) {
				ans = Math.min(ans, mid);
				System.out.println("answer:" + ans);
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		return ans;

	}

}
