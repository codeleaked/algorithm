package com.codeleaked.algorithm.onethreetwo;

public class Solution {

    public boolean find132pattern(int[] nums) {
        if (nums.length == 0) return false;
        int smallest = nums[0];

        int[] largest = new int[nums.length];
        for (int i = 0; i )


        for (int i = 1; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[j] > smallest && nums[j] < nums[i]) {
                    return true;
                }
            }

            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }

        return false;
    }

}

