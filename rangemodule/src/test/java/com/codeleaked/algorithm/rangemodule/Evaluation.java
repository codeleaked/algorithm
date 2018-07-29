package com.codeleaked.algorithm.rangemodule;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Evaluation {

    private RangeModule rangeModule = new RangeModule();

    @Test
    public void test() {
        rangeModule.addRange(10, 20);
        rangeModule.removeRange(14, 16);
        assertThat(rangeModule.queryRange(10, 14)).isTrue();
        assertThat(rangeModule.queryRange(13, 15)).isFalse();
        assertThat(rangeModule.queryRange(16, 17)).isTrue();
    }

}