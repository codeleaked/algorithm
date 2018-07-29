package com.codeleaked.algorithm.networkdelay;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int networkDelayTime(int[][] times, int N, int K) {
        int[] delay = new int[N + 1];
        Set<Integer> visited = new HashSet<>();
        for (int i = 1; i <= N; ++i) {
            delay[i] = (i == K ? 0: Integer.MAX_VALUE);
        }

        for (int i = 0; i < N; ++i) {
            int k = peekTheSmallest(delay, visited, N);
            visited.add(k);
            for (int[] time : times) {
                if (time[0] == k) {
                    if (!visited.contains(time[1]) && delay[time[1]] > delay[k] + time[2]) {
                        delay[time[1]] = delay[k] + time[2];
                    }
                }
            }
        }

        int maxDelay = -1;
        for (int i = 1; i <= N; ++i) {
            if (maxDelay < delay[i]) {
                maxDelay = delay[i];
            }
        }

        return (maxDelay == Integer.MAX_VALUE ? -1 : maxDelay);
    }

    private int peekTheSmallest(int[] delay, Set<Integer> visited, int N) {
        int smallest = Integer.MAX_VALUE;
        int k = 0;
        for (int i = 1; i <= N; ++i) {
            if (!visited.contains(i) && smallest > delay[i]) {
                smallest = delay[i];
                k = i;
            }
        }

        return k;
    }

}
