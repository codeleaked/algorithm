package com.codeleaked.algorithm.oneeditdistance;

public class Solution {

    public boolean isOneEditDistance(String s, String t) {
        int[][] distance = new int[s.length()][t.length()];

        for (int i = 0; i < s.length(); ++i) {
            for (int j = 0; j < t.length(); ++j) {
                if (s.charAt(i) == t.charAt(j)) {
                    if (i > 0 && j > 0) {
                        distance[i][j] = distance[i - 1][j - 1];
                    } else {
                        distance[i][j] = Math.max(i, j);
                    }
                } else {
                    distance[i][j] = i + j;
                    if (i > 0) {
                        distance[i][j] = distance[i - 1][j] + 1;
                    }
                    if (j > 0 && distance[i][j] > distance[i][j - 1] + 1) {
                        distance[i][j] = distance[i][j - 1] + 1;
                    }
                }
            }
        }

        return distance[s.length() - 1][t.length() - 1] <= 1;
    }

}
