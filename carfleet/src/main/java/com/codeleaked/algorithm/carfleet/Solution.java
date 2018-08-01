package com.codeleaked.algorithm.carfleet;

public class Solution {

    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length <= 1) {
            return position.length;
        }

        int n = position.length;
        int[][] meet = new int[n][n];
        int reached = 0;
        int fleets = 0;

        while (reached < n) {
            for (int i = 0; i < n; ++i) {
                if (position[i] < target) {
                    for (int j = 0; j < n; ++j) {
                        if (position[j] == position[i] && speed[i] > speed[j]) {
                            speed[i] = speed[j];
                        }
                    }
                }
            }

            float minStep = calculateMinStep(target, position, speed);
            boolean hasReached = false;
            for (int i = 0; i < n; ++i) {
                if (position[i] < target) {
                    position[i] += minStep * speed[i];
                    if (position[i] >= target) {
                        ++reached;
                        hasReached = true;
                    }
                }

            }
            if (hasReached) {
                ++fleets;
            }
        }

        return fleets;
    }

    private float calculateMinStep(int target, int[] position, int[] speed) {
        int n = position.length;
        float minStep = n + 1;
        for (int i = 0; i < n; ++i) {
            if (position[i] < target) {
                minStep = Math.min(minStep, (target - position[i]) / (float)speed[i]);
                for (int j = 0; j < n; ++j) {
                    if (position[j] < target) {
                        if ((position[i] < position[j] && speed[i] > speed[j])
                        || (position[i] > position[j] && speed[i] < speed[j])) {
                            float step = Math.abs(position[j] - position[i]) / (float)Math.abs(speed[i] - speed[j]);
                            minStep = Math.min(minStep, step);
                        }
                    }
                }
            }
        }

        return minStep;
    }

}
