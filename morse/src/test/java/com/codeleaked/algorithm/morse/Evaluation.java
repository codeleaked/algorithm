package com.codeleaked.algorithm.morse;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test() {
        String[] words = {"gin", "zen", "gig", "msg"};

        assertThat(solution.uniqueMorseRepresentations(words)).isEqualTo(2);
    }

}
