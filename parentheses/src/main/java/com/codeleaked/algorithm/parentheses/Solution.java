package com.codeleaked.algorithm.parentheses;

import java.util.Stack;

class Solution {

    boolean isValid(String expr) {
        if (expr == null) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for (char c: expr.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char last = stack.pop();
                    if ((c == ')' && last != '(') || (c == ']' && last != '[') || (c == '}' && last != '{')) {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }

}
