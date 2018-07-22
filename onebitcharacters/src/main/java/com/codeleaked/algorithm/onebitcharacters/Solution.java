package com.codeleaked.algorithm.onebitcharacters;

public class Solution {

    boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        boolean output = false;
        while (i < bits.length) {
            if (bits[i] == 1) {
                i += 2;
                output = false;
            } else {
                ++i;
                output = true;
            }
        }
        return output;
    }
}

