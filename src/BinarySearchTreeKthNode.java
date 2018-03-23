import Others.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeKthNode {
    List<TreeNode> inOrderList = new ArrayList();
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot == null || k <= 0) return null;
        inOrder(pRoot);
        if (k > inOrderList.size()) return null;
        return inOrderList.get(k-1);
    }
    void inOrder(TreeNode root){
        if (root == null) return ;
        inOrder(root.left);
        inOrderList.add(root);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode n5 = new TreeNode(5);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n11 = new TreeNode(11);
        TreeNode n6 = new TreeNode(6);
        TreeNode n10 = new TreeNode(10);
        TreeNode n8 = new TreeNode(8);
        n6.left = n5;   n6.right = n7;
        n10.left = n9; n10.right = n11;
        n8.left = n6;  n8.right = n10;

        System.out.println(new BinarySearchTreeKthNode().KthNode(n8, 8).val);
    }
}