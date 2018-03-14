import Others.TreeNode;

public class BinarySearchTree2DoubleDirecLists {

    private TreeNode pre = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        inOrder(pRootOfTree);
        while (pRootOfTree.left != null) pRootOfTree = pRootOfTree.left;
        return pRootOfTree;
    }

    private void inOrder(TreeNode node){
        if (node == null) return;
        inOrder(node.left);
        node.left = pre;
        if (pre != null) pre.right = node;
        pre = node;
//        System.out.println(pre.val);
        inOrder(node.right);
    }

    public static void main(String[] args) {
        TreeNode n4 = new TreeNode(4);
        TreeNode n8 = new TreeNode(8);
        TreeNode n12 = new TreeNode(12);
        TreeNode n16 = new TreeNode(16);
        TreeNode n6 = new TreeNode(6);
        TreeNode n14 = new TreeNode(14);
        TreeNode n10 = new TreeNode(10);
        n6.left = n4;   n6.right = n8;
        n14.left = n12; n14.right = n16;
        n10.left = n6;  n10.right = n14;
        new BinarySearchTree2DoubleDirecLists().Convert(n10);
    }
}
