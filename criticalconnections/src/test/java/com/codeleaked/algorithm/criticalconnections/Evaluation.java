package com.codeleaked.algorithm.criticalconnections;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        int n = 4;
        List<List<Integer>> connections = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 2),
                Arrays.asList(2, 0),
                Arrays.asList(1, 3)
        );

        List<List<Integer>> output = solution.criticalConnections(n, connections);

        assertThat(output).hasSize(1);
        assertThat(output.get(0)).containsExactly(1, 3);
    }

    @Test
    public void test2() {
        int n = 9;
        List<List<Integer>> connections = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(0, 2),
                Arrays.asList(1, 2),
                Arrays.asList(2, 3),
                Arrays.asList(3, 4),
                Arrays.asList(2, 5),
                Arrays.asList(5, 6),
                Arrays.asList(6, 7),
                Arrays.asList(7, 8),
                Arrays.asList(5, 8)
        );

        List<List<Integer>> output = solution.criticalConnections(n, connections);

        assertThat(output).hasSize(3);
        assertThat(output.get(0)).containsExactly(2, 3);
        assertThat(output.get(1)).containsExactly(3, 4);
        assertThat(output.get(2)).containsExactly(2, 5);
    }

    @Test
    public void test3() {
        int n = 4;
        List<List<Integer>> connections = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 2),
                Arrays.asList(2, 3),
                Arrays.asList(3, 0)
        );

        List<List<Integer>> output = solution.criticalConnections(n, connections);

        assertThat(output).isEmpty();
    }

}
