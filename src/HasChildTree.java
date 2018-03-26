import Others.TreeNode;

public class HasChildTree {
/*  前序遍历，是否含有子串
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        return preOrder(root1).contains(preOrder(root2));
    }
    public String preOrder(TreeNode root){
        StringBuffer sb = new StringBuffer();
        if (root == null)
            return "";
        sb.append(root.val + "!");
        sb.append(preOrder(root.left));
        sb.append(preOrder(root.right));
        return sb.toString();
    }
*/
public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    if (root1 == null || root2 == null) return false;
    return isSubTree(root1, root2) || isSubTree(root1.left, root2) || isSubTree(root1.right, root2);
}
public boolean isSubTree(TreeNode root1, TreeNode root2){
    if (root2 == null) return true;
    if (root1 == null) return false;
    if (root1.val != root2.val) return false;
    return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
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
//        System.out.println(new HasChildTree().preOrder(n10));
    }
}
