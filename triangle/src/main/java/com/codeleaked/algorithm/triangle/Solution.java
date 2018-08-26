package com.codeleaked.algorithm.triangle;

import java.util.List;

public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] prev = new int[n + 1];
        prev[0] = 0;
        int[] sum = new int[n + 1];
        for (List<Integer> row: triangle) {
            if (row.size() == 1) {
                sum[0] = row.get(0);
            } else {
                for (int i = 0; i < row.size(); ++i) {
                    int min = Integer.MAX_VALUE;
                    if (i > 0) {
                        min = Math.min(min, prev[i - 1]);
                    }
                    if (i < row.size() - 1) {
                        min = Math.min(min, prev[i]);
                    }
                    sum[i] = min + row.get(i);
                }
            }
            for (int i = 0; i < row.size(); ++i) {
                prev[i] = sum[i];
            }

            int x = 0;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            if (min > sum[i]) {
                min = sum[i];
            }
        }

        return min;
    }


}
