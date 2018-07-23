package com.codeleaked.algorithm.twokeys;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    class Element {
        int num;
        int copied;
        int steps;

        public Element(int num, int copied, int steps) {
            this.num = num;
            this.copied = copied;
            this.steps = steps;
        }

        public int getNum() {
            return num;
        }

        public int getCopied() {
            return copied;
        }

        public int getSteps() {
            return steps;
        }

    }

    public int minSteps(int n) {

        Deque<Element> queue = new ArrayDeque<>();

        queue.add(new Element(1, 0, 0));

        boolean stop = false;
        Element element = null;
        while (!stop) {
            element = queue.poll();
            System.out.println(element.getNum() + " " + element.getCopied() + " " + element.getSteps());
            if (element.getNum() == n) {
                stop = true;
            }
            if (element.getCopied() > 0 && element.getNum() + element.getCopied() <= n) {
                queue.add(new Element(element.getNum() + element.getCopied(), element.getCopied(), element.getSteps() + 1));
            }
            if (element.getNum() != element.getCopied()) {
                 queue.add(new Element(element.getNum(), element.getNum(), element.getSteps() + 1));
            }
        }

        return element.getSteps();
    }

}
