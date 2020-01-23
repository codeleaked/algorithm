package com.codeleaked.algorithm.serializedeserializebinarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Solution {

    public String serialize(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node == null) {
                nums.add(null);
            } else {
                nums.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }

        return nums.stream().map(num -> num == null? "null": num.toString()).collect(Collectors.joining(" "));
    }

    public TreeNode deserialize(String data) {
        if (data.equals("null")) {
            return null;
        }

        String[] values = data.split(" ");
        Integer[] nums = new Integer[values.length];
        for (int i = 0; i < nums.length; ++i) {
            if (values[i].equals("null")) {
                nums[i] = null;
            } else {
                nums[i] = Integer.valueOf(values[i]);
            }
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(nums[0]);
        queue.add(root);
        int k = 1;

        while (k < nums.length) {
            TreeNode node = queue.remove();
            if (nums[k] == null) {
                node.left = null;
            } else {
                TreeNode left = new TreeNode(nums[k]);
                node.left = left;
                queue.add(left);
            }


            if (nums[k + 1] == null) {
                node.right = null;
            } else {
                TreeNode right = new TreeNode(nums[k + 1]);
                node.right = right;
                queue.add(right);
            }
            k += 2;
        }

        return root;
    }

}
