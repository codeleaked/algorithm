package com.codeleaked.algorithm.binarytreediameter;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node5 = new TreeNode(5, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);

        TreeNode node3 = new TreeNode(3, null, null);

        TreeNode root = new TreeNode(1, node2, node3);

        assertThat(solution.diameterOfBinaryTree(root)).isEqualTo(3);
    }

}