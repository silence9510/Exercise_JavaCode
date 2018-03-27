import Others.TreeNode;

public class BinaryTreeMirror {
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
