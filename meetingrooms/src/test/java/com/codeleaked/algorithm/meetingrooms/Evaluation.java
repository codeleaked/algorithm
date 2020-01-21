package com.codeleaked.algorithm.meetingrooms;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        int[][] intervals = new int[][] {
                new int[] { 0, 30 },
                new int[] { 5, 10 },
                new int[] { 15, 20 }
        };

        assertThat(solution.minMeetingRooms(intervals)).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[][] intervals = new int[][] {
                new int[] { 7, 10 },
                new int[] { 2, 4 }
        };

        assertThat(solution.minMeetingRooms(intervals)).isEqualTo(1);
    }

    @Test
    public void test3() {
        int[][] intervals = new int[][] {
                new int[] { 13, 15 },
                new int[] { 1, 13 }
        };

        assertThat(solution.minMeetingRooms(intervals)).isEqualTo(1);
    }

    @Test
    public void test4() {
        assertThat(solution.minMeetingRooms(new int[][] {})).isEqualTo(0);
    }

}
