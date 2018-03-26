import Others.TreeNode;

import java.util.LinkedList;

public class BinaaryTreeMirror {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        swapTreeNode(root);
        Mirror(root.left);
        Mirror(root.right);
    }
    public void swapTreeNode(TreeNode n){
        TreeNode temp = n.left;
        n.left = n.right;
        n.right = temp;
    }
 }
