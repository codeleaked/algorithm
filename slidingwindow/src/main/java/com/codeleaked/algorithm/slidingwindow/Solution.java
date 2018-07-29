package com.codeleaked.algorithm.slidingwindow;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[]{};
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (integer, other) -> -Integer.compare(integer, other));
        for (int i = 0; i < k; ++i) {
            queue.add(nums[i]);
        }

        int[] output = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k - 1; ++i) {
            Integer max = queue.poll();
            output[i] = max;
            queue.add(nums[i + k]);
        }

        return output;
    }

}
