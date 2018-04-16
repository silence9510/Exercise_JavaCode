// Created by ZCL on 2018-04-16.

import Others.TreeNode;

public class BalancedBinaryTree {

    private boolean isBalanced = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        height(root);
        return isBalanced;
    }
    private int height(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left), right = height(root.right);
        if (Math.abs(left - right) > 1) {
            isBalanced = false;
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
