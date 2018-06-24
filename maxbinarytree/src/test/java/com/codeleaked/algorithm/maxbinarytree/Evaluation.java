package com.codeleaked.algorithm.maxbinarytree;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static com.google.common.truth.Truth.assertThat;

@RunWith(Parameterized.class)
public class Evaluation {

    private Solution solution;

    private int[] nums;

    private List<Integer> expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {
                        new int[]{3, 2, 1, 6, 0, 5},
                        Arrays.asList(6, 3, 5, null, 2, 0, null, null, 1, null, null, null, null)
                },
                {
                        new int[]{1, 2, 3, 4, 5, 6},
                        Arrays.asList(6, 5, null, 4, null, 3, null, 2, null, 1, null, null, null)
                }
        });
    }

    public Evaluation(int[] nums, List<Integer> expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Test
    public void test() {
        TreeNode root = solution.constructMaximumBinaryTree(nums);

        List<Integer> output = bfs(root);

        assertThat(output).isEqualTo(expected);
    }

    private List<Integer> bfs(TreeNode root) {
        List<Integer> values = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);


        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            values.add(node == null ? null : node.val);

            if (node != null) {
                queue.add(node.left);
            }

            if (node != null) {
                queue.add(node.right);
            }
        }

        return values;
    }
}
