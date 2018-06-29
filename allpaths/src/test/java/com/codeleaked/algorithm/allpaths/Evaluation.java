package com.codeleaked.algorithm.allpaths;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution;

    private int[][] graph = new int[][]{
            new int[]{1, 2},
            new int[]{3},
            new int[]{3},
            new int[]{}
    };

    private List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(0, 1, 3),
            Arrays.asList(0, 2, 3)
    );

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test() {
        List<List<Integer>> result = solution.allPathsSourceTarget(graph);
        assertThat(solution.allPathsSourceTarget(graph)).isEqualTo(expected);
    }

}
