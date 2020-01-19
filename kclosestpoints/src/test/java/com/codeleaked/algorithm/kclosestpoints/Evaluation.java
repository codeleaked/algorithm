package com.codeleaked.algorithm.kclosestpoints;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        int K = 1;
        int[] p1 = new int[]{1, 3};
        int[] p2 = new int[]{-2, 2};
        int[][] points = new int[][] {
            p1, p2
        };

        assertThat(solution.kClosest(points, K)).asList().containsExactly(p2);
    }

    @Test
    public void test2() {
        int K = 2;
        int[] p1 = new int[]{3, 3};
        int[] p2 = new int[]{5, -1};
        int[] p3 = new int[]{-2, 4};
        int[][] points = new int[][] {
                p1, p2, p3
        };

        assertThat(solution.kClosest(points, K)).asList().containsExactly(p1, p3);
    }

    @Test
    public void test3() {
        int K = 5;
        int[] p1 = new int[]{-95,76};
        int[] p2 = new int[]{17,7};
        int[] p3 = new int[]{-55,-58};
        int[] p4 = new int[]{53,20};
        int[] p5 = new int[]{-69,-8};
        int[] p6 = new int[]{-57,87};
        int[] p7 = new int[]{-2,-42};
        int[] p8 = new int[]{-10,-87};
        int[] p9 = new int[]{-36,-57};
        int[] p10 = new int[]{97,-39};
        int[] p11 = new int[]{97,49};

        int[][] points = new int[][] {
                p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11
        };

        assertThat(solution.kClosest(points, K)).asList().containsExactly(p2, p7, p4, p9, p5);
    }
}
