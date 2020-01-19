package com.codeleaked.algorithm.kclosestpoints;

import java.util.PriorityQueue;

public class Solution {

    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(K, (point, other) -> comparePoints(other, point));
        for (int[] point: points) {
            if (pq.size() < K) {
                pq.add(point);
            } else if (comparePoints(point, pq.peek()) < 0) {
                pq.poll();
                pq.add(point);
            }
        }

        int[][] output = new int[K][2];
        int i = 0;
        while (!pq.isEmpty()) {
            output[i] = pq.poll();
            ++i;
        }
        return output;
    }

    int comparePoints(int[] p1, int[] p2) {
        return Double.compare(Math.pow(p1[0], 2) + Math.pow(p1[1], 2), Math.pow(p2[0], 2) + Math.pow(p2[1], 2));
    }

}
