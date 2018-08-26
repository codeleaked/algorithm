package com.codeleaked.algorithm.triangle;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        List<List<Integer>> triangle = Lists.newArrayList(
                Lists.newArrayList(2),
                Lists.newArrayList(3, 4),
                Lists.newArrayList(6, 5, 7),
                Lists.newArrayList(4, 1, 8, 3)
        );

        int output = solution.minimumTotal(triangle);
        assertThat(output).isEqualTo(11);
    }

}