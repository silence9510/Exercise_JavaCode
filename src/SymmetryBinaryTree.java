// Created by ZCL on 2018-04-16.

import Others.TreeNode;

public class SymmetryBinaryTree {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null) return true;
        return isSymmetrical(pRoot.left, pRoot.right);
    }
    boolean isSymmetrical(TreeNode lNode, TreeNode rNode) {
        if (lNode == null && rNode == null) return true;
        if (lNode == null || rNode == null) return false;
        if (lNode.val != rNode.val) return false;
        return isSymmetrical(lNode.left, rNode.right) && isSymmetrical(lNode.right, rNode.left);
    }
}
