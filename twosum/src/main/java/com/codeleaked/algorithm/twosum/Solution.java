package com.codeleaked.algorithm.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            index.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 1; ++i) {
            Integer k = index.get(target - nums[i]);
            if (k != null && k > i) {
                return new int[]{i, k};
            }
        }

        return new int[]{};
    }

}
