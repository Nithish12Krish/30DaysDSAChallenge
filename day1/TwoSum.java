package com.nithish.day1;

import java.util.HashMap;
import java.util.Map;


// Problem Link : https://leetcode.com/problems/two-sum/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numToFind=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(numToFind.containsKey(nums[i])){
                return new int[]{i,numToFind.get(nums[i])};
            }
            else{
                numToFind.put(target-nums[i],i);
            }
        }
        return null;
        
    }
}
