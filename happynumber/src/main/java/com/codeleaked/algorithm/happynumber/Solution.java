package com.codeleaked.algorithm.happynumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (true) {
            int sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (sum == 1) {
                return true;
            } else if (seen.contains(sum)) {
                return false;
            } else {
                seen.add(sum);
                n = sum;
            }
        }
    }

}
