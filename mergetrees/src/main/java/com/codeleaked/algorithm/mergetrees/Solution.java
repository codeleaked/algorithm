package com.codeleaked.algorithm.mergetrees;

import com.codeleaked.algorithm.common.tree.TreeNode;

public class Solution {

    TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        TreeNode root = new TreeNode(0);
        mergeTrees(root, t1, t2);

        return root;
    }

    private void mergeTrees(TreeNode newNode, TreeNode t1, TreeNode t2) {
        newNode.val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);

        if ((t1 != null && t1.left != null) || (t2 != null && t2.left != null)) {
            TreeNode left = new TreeNode(0);
            newNode.left = left;
            mergeTrees(left, t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        }

        if ((t1 != null && t1.right != null) || (t2 != null && t2.right != null)) {
            TreeNode right = new TreeNode(0);
            newNode.right = right;
            mergeTrees(right, t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        }
    }

}
