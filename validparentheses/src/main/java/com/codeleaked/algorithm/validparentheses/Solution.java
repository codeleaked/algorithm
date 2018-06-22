package com.codeleaked.algorithm.validparentheses;

import java.util.Stack;

class Solution {

    boolean isValid(String s) {
        if (s == null) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for (char c: s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char last = stack.pop();
                    if ((c == ')' && last == '[') || (c == ']' && last == '(')) {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }

}
