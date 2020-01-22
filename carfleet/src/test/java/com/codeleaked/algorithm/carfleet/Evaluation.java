package com.codeleaked.algorithm.carfleet;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        int target = 12;
        int[] position = new int[]{10, 8, 0, 5, 3};
        int[] speed = new int[]{2, 4, 1, 1, 3};

        int output = solution.carFleet(target, position, speed);

        assertThat(output).isEqualTo(3);
    }

    @Test
    public void test2() {
        int target = 10;
        int[] position = new int[]{3};
        int[] speed = new int[]{3};

        int output = solution.carFleet(target, position, speed);

        assertThat(output).isEqualTo(1);
    }

    @Test
    public void test3() {
        int target = 10;
        int[] position = new int[]{6, 8};
        int[] speed = new int[]{3, 2};

        int output = solution.carFleet(target, position, speed);

        assertThat(output).isEqualTo(1);
    }

    @Test
    public void test4() {
        int target = 10;
        int[] position = new int[]{8, 3, 7, 4, 6, 5};
        int[] speed = new int[]{4, 4, 4, 4, 4, 4};

        int output = solution.carFleet(target, position, speed);

        assertThat(output).isEqualTo(6);
    }


    @Test
    public void test5() {
        int target = 13;
        int[] position = new int[]{10, 2, 5, 7, 4, 6, 11};
        int[] speed = new int[]{7, 5, 10, 5, 9, 4, 1};

        int output = solution.carFleet(target, position, speed);

        assertThat(output).isEqualTo(2);
    }
}