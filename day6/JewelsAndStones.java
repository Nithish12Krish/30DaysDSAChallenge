package com.nithish.day6;

import java.util.HashSet;
import java.util.Set;

//ProblemLink: https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {
	public int numJewelsInStones(String jewels, String stones) {

		Set<Character> jewelsMap = new HashSet<>();
		int count = 0;

		for (int i = 0; i < jewels.length(); i++) {
			jewelsMap.add(jewels.charAt(i));
		}

		for (int j = 0; j < stones.length(); j++) {

			char stone = stones.charAt(j);
			if (jewelsMap.contains(stone)) {
				count++;
			}
		}

		return count;

	}

}
