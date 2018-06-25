package com.codeleaked.algorithm.binarytreepruning;

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

    private Integer[] nums;

    private List<Integer> expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {
                        new Integer[]{1, null, 0, 0, 1},
                        Arrays.asList(1, null, 0, null, 1)
                },
                {
                        new Integer[]{1, 0, 1, 0, 0, 0, 1},
                        Arrays.asList(1, null, 1, null, 1)
                },
                {
                        new Integer[]{1, 1, 0, 1, 1, 0, 1, 0},
                        Arrays.asList(1, 1, 0, 1, 1, null, 1)
                }
        });
    }

    public Evaluation(Integer[] nums, List<Integer> expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Test
    public void test() {
        TreeNode root = buildTree(nums);

        TreeNode prunedTree = solution.pruneTree(root);

        List<Integer> output = bfs(prunedTree);

        assertThat(output).isEqualTo(expected);
    }

    private TreeNode buildTree(Integer[] nums) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(nums[0]);
        queue.add(root);

        boolean isLeft = true;
        TreeNode cur = null;
        for (int i = 1; i < nums.length; ++i) {
            Integer num = nums[i];
            if (isLeft) {
                cur = queue.poll();
                TreeNode left = null;
                if (num != null) {
                    left = new TreeNode(num);
                    queue.add(left);
                }
                cur.left = left;
            } else {
                TreeNode right = null;
                if (num != null) {
                    right = new TreeNode(num);
                    queue.add(right);
                }
                cur.right = right;
            }

            isLeft = !isLeft;
        }

        return root;
    }

    private List<Integer> bfs(TreeNode root) {
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
