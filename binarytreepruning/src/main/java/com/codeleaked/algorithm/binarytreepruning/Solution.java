package com.codeleaked.algorithm.binarytreepruning;

import com.codeleaked.algorithm.common.tree.TreeNode;

public class Solution {

    TreeNode pruneTree(TreeNode root) {
        return canPrune(root) ? null : root;
    }

    private boolean canPrune(TreeNode node) {
        if (node == null) {
            return true;
        }

        boolean prunable = true;

        if (canPrune(node.left)) {
            node.left = null;
        } else {
            prunable = false;
        }

        if (canPrune(node.right)) {
            node.right = null;
        } else {
            prunable = false;
        }

        return prunable && (node.val == 0);
    }

}
