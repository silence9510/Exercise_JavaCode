import Others.TreeNode;

import java.util.LinkedList;

public class BinaryTreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        int depth = 0;
        LinkedList<TreeNode> q = new LinkedList<>();
        TreeNode head = root, last = head, nlast = head.right;
        q.add(head);
        while (!q.isEmpty()) {
            head = q.removeFirst();
            if (head.left != null) {
                nlast = head.left;
                q.add(head.left);
            }
            if (head.right != null) {
                nlast = head.right;
                q.add(head.right);
            }
            if (head == last){
                depth += 1;
                last = nlast;
            }
         }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode n7 = new TreeNode(7);
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);
        n1.left = n2; n1.right = n3;
        n2.left = n4; n2.right = n5; n3.right = n6;
        n5.left = n7;

        System.out.println(new BinaryTreeDepth().TreeDepth(n1));
    }
}
