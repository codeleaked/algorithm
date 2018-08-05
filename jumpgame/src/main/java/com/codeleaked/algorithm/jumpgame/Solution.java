package com.codeleaked.algorithm.jumpgame;

class Solution {
    public int jump(int[] nums) {
        int index = 0, max = 0, target = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == target) {
                index++;
                target = max;
            }
        }
        return index;
    }
}