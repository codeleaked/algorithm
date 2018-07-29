package com.codeleaked.algorithm.rangemodule;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RangeModule {

    List<Interval> intervals = new ArrayList<>();

    public void addRange(int left, int right) {
        Set<Interval> intervalsToRemove = new HashSet<>();
        for (Interval interval: intervals) {
            if (interval.left <= left && left <= interval.right) {
                left = interval.left;
                intervalsToRemove.add(interval);
            }
            if (interval.left <= right && right <= interval.right) {
                right = interval.right;
                intervalsToRemove.add(interval);
            }
        }

        intervals.removeAll(intervalsToRemove);
        intervals.add(new Interval(left, right));
    }

    public boolean queryRange(int left, int right) {
        for (Interval interval: intervals) {
            if (interval.left <= left && interval.right >= right) {
                return true;
            }
        }

        return false;
    }

    public void removeRange(int left, int right) {
        Set<Interval> intervalsToRemove = new HashSet<>();
        Set<Interval> intervalsToAdd = new HashSet<>();

        for (Interval interval: intervals) {
            if (left <= interval.left && right >= interval.right) {
                intervalsToRemove.add(interval);
            } else if (interval.left <= left && right <= interval.right) {
                intervalsToRemove.add(interval);
                intervalsToAdd.add(new Interval(interval.left, left));
                intervalsToAdd.add(new Interval(right, interval.right));
            } else if (interval.left <= left && left <= interval.right && interval.right <= right) {
                intervalsToRemove.add(interval);
                intervalsToAdd.add(new Interval(interval.left, left));
            } else if (left <= interval.left && interval.left <= right && right <= interval.right) {
                intervalsToRemove.add(interval);
                intervalsToAdd.add(new Interval(right, interval.right));
            }
        }

        intervals.removeAll(intervalsToRemove);
        intervals.addAll(intervalsToAdd);
    }


    class Interval implements Comparable<Interval> {
        int left;
        int right;

        public Interval(int left, int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Interval interval) {
            if (this.right == interval.right) {
                return Integer.compare(this.left, interval.left);
            } else {
                return Integer.compare(this.right, interval.right);
            }
        }
    }

}
