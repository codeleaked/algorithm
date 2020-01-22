package com.codeleaked.algorithm.bst;

import com.codeleaked.algorithm.common.tree.TreeNode;

public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = (root.val > val ? root.left : root.right);
        }

        return root;
    }

}
