package com.codeleaked.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    String[] valid = new String[] {
            "()",
            "()[]",
            "([])",
            ""
    };

    String[] invalid = new String[] {
            "(]",
            "([)]"
    };


    @Test
    void shouldReturnValid() {
        for (String s: valid) {
            Assertions.assertTrue(ValidParentheses.isValid(s));
        }
    }

    @Test
    void shouldReturnInvalid() {
        for (String s: invalid) {
            Assertions.assertFalse(ValidParentheses.isValid(s));
        }
    }

}