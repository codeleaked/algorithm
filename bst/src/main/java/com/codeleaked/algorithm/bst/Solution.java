package com.codeleaked.algorithm.bst;

import com.codeleaked.algorithm.common.tree.TreeNode;

public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val == val) {
                return cur;
            } else if (cur.val < val) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }

        return null;
    }

}
