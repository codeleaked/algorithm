package com.codeleaked.algorithm.climbingstairs;

public class Solution {

    public int climbStairs(int n) {
        int[] solutions = new int[n + 1];

        solutions[0] = 1;
        solutions[1] = 1;
        for (int i = 2; i <= n; ++i) {
            solutions[i] = solutions[i - 1] + solutions[i - 2];
        }

        return solutions[n];
    }

}
