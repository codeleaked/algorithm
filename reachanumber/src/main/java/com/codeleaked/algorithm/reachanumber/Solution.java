package com.codeleaked.algorithm.reachanumber;

public class Solution {

    public int reachNumber(int target) {
        int sum = 0;
        int num = 0;
        target = Math.abs(target);
        while (sum < target) {
            ++num;
            sum += num;
        }

        if ((sum - target) % 2 == 0) {
            return num;
        } else if (num % 2 == 0) {
            return num + 1;
        } else {
            return num + 2;
        }
    }

}
