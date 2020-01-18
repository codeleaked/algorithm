package com.codeleaked.algorithm.maximumsubarray;

public class Solution {

    public int maxSubArray(int[] nums) {
        int sum = nums[0], max = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            sum = Math.max(sum, 0) + nums[i];
            max = Math.max(max, sum);
        }

        return max;
    }

}
