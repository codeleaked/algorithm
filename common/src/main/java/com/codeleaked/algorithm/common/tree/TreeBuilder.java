package com.codeleaked.algorithm.common.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBuilder {

    public static TreeNode build(Integer[] nums) {

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = nums.length > 0 ? new TreeNode(nums[0]) : null;
        queue.add(root);

        boolean isLeft = true;
        TreeNode cur = null;
        for (int i = 1; i < nums.length; ++i) {
            Integer num = nums[i];
            if (isLeft) {
                cur = queue.poll();
                TreeNode left = null;
                if (num != null) {
                    left = new TreeNode(num);
                    queue.add(left);
                }
                cur.left = left;
            } else {
                TreeNode right = null;
                if (num != null) {
                    right = new TreeNode(num);
                    queue.add(right);
                }
                cur.right = right;
            }

            isLeft = !isLeft;
        }

        return root;
    }

}
