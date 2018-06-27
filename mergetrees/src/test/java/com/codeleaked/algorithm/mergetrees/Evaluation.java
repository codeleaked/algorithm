package com.codeleaked.algorithm.mergetrees;

import com.codeleaked.algorithm.common.tree.TreeBuilder;
import com.codeleaked.algorithm.common.tree.TreeTraverser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.codeleaked.algorithm.common.tree.TreeNode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

@RunWith(Parameterized.class)
public class Evaluation {

    private Solution solution;

    private Integer[] left;

    private Integer[] right;

    private List<Integer> expected;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {
                        new Integer[]{1, 3, 2, 5},
                        new Integer[]{2, 1, 3, null, 4, null, 7},
                        Arrays.asList(3, 4, 5, 5, 4, null, 7)
                },
                {
                        new Integer[]{},
                        new Integer[]{},
                        Collections.emptyList()
                }
        });
    }

    public Evaluation(Integer[] left, Integer[] right, List<Integer> expected) {
        this.left = left;
        this.right = right;
        this.expected = expected;
    }

    @Test
    public void test() {
        TreeNode leftTree = TreeBuilder.build(left);
        TreeNode rightTree = TreeBuilder.build(right);

        TreeNode merged = solution.mergeTrees(leftTree, rightTree);

        List<Integer> bfs = TreeTraverser.bfs(merged);

        assertThat(bfs).isEqualTo(expected);
    }

}