package com.codeleaked.algorithm.binarytreepruning;

import com.codeleaked.algorithm.common.tree.TreeBuilder;
import com.codeleaked.algorithm.common.tree.TreeNode;
import com.codeleaked.algorithm.common.tree.TreeTraverser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
        TreeNode root = TreeBuilder.build(nums);

        TreeNode prunedTree = solution.pruneTree(root);

        List<Integer> output = TreeTraverser.bfs(prunedTree);

        assertThat(output).isEqualTo(expected);
    }

}
