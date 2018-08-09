package com.codeleaked.algorithm.bst;

import com.codeleaked.algorithm.common.tree.TreeNode;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);

        node4.left = node2;
        node4.right = node7;

        node2.left = node1;
        node2.right =node3;

        TreeNode output = solution.searchBST(node4, 2);

        assertThat(output.val).isEqualTo(2);

        assertThat(output.left.val).isEqualTo(1);
        assertThat(output.left.left).isNull();
        assertThat(output.left.right).isNull();

        assertThat(output.right.val).isEqualTo(3);
        assertThat(output.right.left).isNull();
        assertThat(output.right.right).isNull();
    }

}