package com.codeleaked.algorithm.friendcircles;

import java.util.LinkedList;

public class Solution {

    public int findCircleNum(int[][] M) {
        int n = M.length - 1;
        boolean[] visited = new boolean[n + 1];

        int groups = 0;
        for (int i = 0; i <= n; ++i) {
            if (!visited[i]) {
                ++groups;
                visited[i] = true;
                LinkedList<Integer> queue = new LinkedList<>();
                queue.add(i);

                while (!queue.isEmpty()) {
                    int k = queue.pop();
                    for (int j = 0; j <= n; ++j) {
                        if (!visited[j] && M[k][j] == 1) {
                            visited[j] = true;
                            queue.add(j);
                        }
                    }
                }
            }
        }

        return groups;
    }


}
