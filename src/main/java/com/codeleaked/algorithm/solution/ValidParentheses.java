package com.codeleaked.algorithm.solution;

import java.util.Stack;

class ValidParentheses {

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                case ']':
                    if (stack.empty()) {
                        return false;
                    }
                    char last = stack.pop();
                    if ((ch == ')' && last != '(') || (ch == ']' && last != '[')) {
                        return false;
                    }
                    break;
            }
        }

        return stack.empty();
    }

}
