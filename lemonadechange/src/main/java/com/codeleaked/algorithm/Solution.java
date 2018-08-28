package com.codeleaked.algorithm;

public class Solution {

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill: bills) {
            if (bill == 10) {
                if (five == 0) {
                    return false;
                } else {
                    --five;
                    ++ten;
                }
            } else if (bill == 20) {
                if (five > 0 && ten > 0) {
                    --ten;
                    --five;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            } else {
                ++five;
            }
        }

        return true;
    }


}
