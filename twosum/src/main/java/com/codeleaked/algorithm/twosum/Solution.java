package com.codeleaked.algorithm.twosum;

import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] sortedNums = new int[nums.length];
        System.arraycopy(nums, 0, sortedNums, 0, nums.length);
        Arrays.sort(sortedNums);
        int i = 0;
        int j = sortedNums.length - 1;
        int num1 = 0;
        int num2 = 0;
        while (i < j && i < sortedNums.length) {
            if (sortedNums[i] + sortedNums[j] == target) {
                num1 = sortedNums[i];
                num2 = sortedNums[j];
                break;
            } else if (sortedNums[i] + sortedNums[j] < target) {
                ++i;
            } else {
                --j;
            }
        }

        int[] result = new int[2];
        boolean found = false;
        for (int k = 0; k < nums.length; ++k) {
            if (nums[k] == num1 && !found) {
                result[0] = k;
                found = true;
            } else if (nums[k] == num2) {
                result[1] = k;
            }
        }

        return result;
    }

}
