package com.codeleaked.algorithm.selfdividing;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<>();

        for (int num = left; num <= right; ++num) {
            if (isDividingNumber(num)) {
                output.add(num);
            }
        }

        return output;
    }

    private boolean isDividingNumber(int num) {

        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            num /= 10;
        }

        return true;
    }

}
