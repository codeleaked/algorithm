package com.codeleaked.algorithm.trappingrainwater;

public class Solution {

    public int trap(int[] height) {
        int n = height.length;

        int[] highestLeft = new int[n];
        for (int i = 1; i < n; ++i) {
            highestLeft[i] = Math.max(highestLeft[i - 1], height[i - 1]);
        }

        int[] highestRight = new int[n];
        for (int i = n - 2; i >= 0; --i) {
            highestRight[i] = Math.max(highestRight[i + 1], height[i + 1]);
        }

        int water = 0;

        for (int i = 0; i < n; ++i) {
            if (highestLeft[i] > height[i] && highestRight[i] > height[i]) {
                water += Math.min(highestLeft[i], highestRight[i]) - height[i];
            }
        }

        return water;
    }

}
