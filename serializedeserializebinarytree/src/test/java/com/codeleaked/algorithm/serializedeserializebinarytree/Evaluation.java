package com.codeleaked.algorithm.serializedeserializebinarytree;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        // given
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        root.left = left1;
        root.right = right1;

        TreeNode right2 = new TreeNode(4);
        TreeNode right3 = new TreeNode(5);
        right1.left = right2;
        right1.right = right3;

        // when
        String s = solution.serialize(root);
        System.out.println(s);
        TreeNode node = solution.deserialize(s);

        // then
        assertThat(node).isNotEqualTo(root);
        assertThat(node.val).isEqualTo(1);
        assertThat(node.left.val).isEqualTo(2);
        assertThat(node.left.left).isNull();
        assertThat(node.left.right).isNull();
        assertThat(node.right.val).isEqualTo(3);
        assertThat(node.right.left.val).isEqualTo(4);
        assertThat(node.right.left.left).isNull();
        assertThat(node.right.left.right).isNull();
        assertThat(node.right.right.val).isEqualTo(5);
        assertThat(node.right.right.left).isNull();
        assertThat(node.right.right.right).isNull();
    }

    @Test
    public void test2() {
        assertThat(solution.deserialize(solution.serialize(null))).isNull();
    }
}
