package com.codeleaked.algorithm.common.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraverser {

    public static List<Integer> bfs(TreeNode root) {
        List<Integer> values = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            values.add(node == null ? null : node.val);

            if (node != null) {
                if (node.left != null || node.right != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }

        return values;
    }

}
