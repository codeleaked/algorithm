package com.codeleaked.algorithm.meetingrooms;

import java.util.*;

public class Solution {

    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(intervals.length, Comparator.comparingInt(num -> num));
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        queue.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; ++i) {
            if (intervals[i][0] >= queue.peek()) {
                queue.poll();
            }
            queue.add(intervals[i][1]);
        }

        return queue.size();
    }

}
