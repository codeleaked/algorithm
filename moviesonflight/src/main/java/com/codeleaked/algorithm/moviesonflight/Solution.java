package com.codeleaked.algorithm.moviesonflight;

import java.util.*;

public class Solution {

    public List<Integer> moviesWithLongestTotalDuration(int[] movies, int flightDuration) {
        Arrays.sort(movies);

        int n = movies.length;
        int i = 0;
        int j = n - 1;
        int maxSum = 0;
        int movie1 = 0;
        int movie2 = 0;
        while (i < j && i <= n - 1 && j >= 0) {
            int sum = movies[i] + movies[j];
            if (sum <= flightDuration - 30) {
                if (sum > maxSum) {
                    maxSum = sum;
                    movie1 = movies[i];
                    movie2 = movies[j];
                }
                ++i;
            } else {
                --j;
            }
        }

        return Arrays.asList(movie1, movie2);
    }

}
