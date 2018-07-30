package com.codeleaked.algorithm.binarytreediameter;

public class Solution {

    public int diameterOfBinaryTree(TreeNode root) {
        return computeValue(root).diameter;
    }

    private NodeValue computeValue(TreeNode node) {
        if (node == null) {
            return new NodeValue(0, 0);
        } else {
            NodeValue leftNode = computeValue(node.left);
            NodeValue rightNode = computeValue(node.right);
            int maxDiameter = Math.max(Math.max(leftNode.diameter, rightNode.diameter),
                    leftNode.level + rightNode.level);
            return new NodeValue(maxDiameter, Math.max(leftNode.level, rightNode.level) + 1);
        }
    }

    class NodeValue {
        int diameter;
        int level;

        public NodeValue(int diameter, int level) {
            this.diameter = diameter;
            this.level = level;
        }
    }

}
