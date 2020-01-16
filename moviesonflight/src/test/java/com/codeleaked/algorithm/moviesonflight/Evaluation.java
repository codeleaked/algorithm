package com.codeleaked.algorithm.moviesonflight;

import org.junit.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        int[] movies = new int[]{ 90, 85, 75, 60, 120, 150, 125 };
        int flightDuration = 250;

        List<Integer> result = solution.moviesWithLongestTotalDuration(movies, flightDuration);

        assertThat(result).containsExactly(910, 125);
    }

}
