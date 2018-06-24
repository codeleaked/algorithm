package com.codeleaked.algorithm.maxbinarytree;

import java.util.Arrays;

public class Solution {

    TreeNode constructMaximumBinaryTree(int[] nums) {
        int index = findMaxIndex(nums);

        TreeNode node = new TreeNode(nums[index]);
        if (index > 0) {
            node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
        }

        if (index < nums.length - 1) {
            node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, index + 1, nums.length));
        }

        return node;
    }

    private int findMaxIndex(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (maxValue < nums[i]) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

}
