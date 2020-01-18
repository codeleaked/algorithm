package com.codeleaked.algorithm.productexceptself;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        int[] product = solution.productExceptSelf(new int[]{1, 2, 3, 4});
        assertThat(product[0]).isEqualTo(24);
        assertThat(product[1]).isEqualTo(12);
        assertThat(product[2]).isEqualTo(8);
        assertThat(product[3]).isEqualTo(6);
    }

}
