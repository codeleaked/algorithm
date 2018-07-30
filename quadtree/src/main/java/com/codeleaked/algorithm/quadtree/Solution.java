package com.codeleaked.algorithm.quadtree;

public class Solution {

    public Node construct(int[][] grid) {
        return construct(grid, 0, 0, grid.length - 1, grid.length - 1);
    }

    private Node construct(int[][] grid, int x1, int y1, int x2, int y2) {
        boolean allZero = true;
        boolean allOne = true;

        for (int x = x1; x <= x2; ++x) {
            for (int y = y1; y <= y2; ++y) {
                if (grid[x][y] == 0) {
                    allOne = false;
                } else {
                    allZero = false;
                }
            }
        }

        if (allOne || allZero) {
            return new Node(
                    allOne,
                    true,
                    null,
                    null,
                    null,
                    null);
        } else {
            int midX = (x1 + x2) / 2;
            int midY = (y1 + y2) / 2;
            return new Node(false,
                    false,
                    construct(grid, x1, y1, midX - 1, midY - 1),
                    construct(grid, x1, midY, midX - 1, y2),
                    construct(grid, midX, y1, x2, midY - 1),
                    construct(grid, midX, midY, x2, y2)
                    );
        }
    }

    // Definition for a QuadTree node.
    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {
        }

        public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
            val = _val;
            isLeaf = _isLeaf;
            topLeft = _topLeft;
            topRight = _topRight;
            bottomLeft = _bottomLeft;
            bottomRight = _bottomRight;
        }
    }

    ;

}


