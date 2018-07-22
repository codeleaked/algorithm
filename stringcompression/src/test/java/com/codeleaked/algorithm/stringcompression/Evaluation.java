package com.codeleaked.algorithm.stringcompression;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        char[] input = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int output = solution.compress(input);

        assertThat(output).isEqualTo(6);
        assertThat(input[0]).isEqualTo('a');
        assertThat(input[1]).isEqualTo('2');
        assertThat(input[2]).isEqualTo('b');
        assertThat(input[3]).isEqualTo('2');
        assertThat(input[4]).isEqualTo('c');
        assertThat(input[5]).isEqualTo('3');
    }

    @Test
    public void test2() {
        char[] input = new char[]{'a'};
        int output = solution.compress(input);

        assertThat(output).isEqualTo(1);
        assertThat(input[0]).isEqualTo('a');
    }

    @Test
    public void test3() {
        char[] input = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int output = solution.compress(input);

        assertThat(output).isEqualTo(4);
        assertThat(input[0]).isEqualTo('a');
        assertThat(input[1]).isEqualTo('b');
        assertThat(input[2]).isEqualTo('1');
        assertThat(input[3]).isEqualTo('2');
    }

}