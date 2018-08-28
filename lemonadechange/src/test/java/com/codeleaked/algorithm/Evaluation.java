package com.codeleaked.algorithm;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test() {
        int[] bills = new int[]{5, 5, 5, 10, 20};
        boolean output = solution.lemonadeChange(bills);
        assertThat(output).isTrue();
    }

    @Test
    public void test2() {
        int[] bills = new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5};
        boolean output = solution.lemonadeChange(bills);
        assertThat(output).isTrue();
    }


}