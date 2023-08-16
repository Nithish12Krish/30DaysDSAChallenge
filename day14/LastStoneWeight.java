package com.nithish.day14;

import java.util.PriorityQueue;

public class LastStoneWeight {

	public int lastStoneWeight(int[] stones) {

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

		for (int n : stones) {
			maxHeap.add(n);
		}

		while (maxHeap.size() > 0) {

			int stoneOne = maxHeap.poll();

			if (maxHeap.size() == 0) {
				return stoneOne;
			}

			int stoneTwo = maxHeap.poll();

			if (stoneOne != stoneTwo) {
				maxHeap.add(Math.abs(stoneOne - stoneTwo));
			}

		}

		return 0;

	}
}