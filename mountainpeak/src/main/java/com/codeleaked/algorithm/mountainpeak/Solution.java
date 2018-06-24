package com.codeleaked.algorithm.mountainpeak;

public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int peak = Integer.MIN_VALUE;
        int peakIndex = 0;

        for (int i = 0; i < A.length; ++i) {
            if (peak < A[i]) {
                peak = A[i];
                peakIndex = i;
            }
        }

        return peakIndex;
    }
}
