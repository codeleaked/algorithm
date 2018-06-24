package com.codeleaked.algorithm.hammingdistance;

public class Solution {

    int hammingDistance(int x, int y) {
        int distance = 0;
        int xor = x ^ y;

        while (xor > 0) {
            distance += xor % 2;
            xor = xor >> 1;
        }

        return distance;
    }

}
