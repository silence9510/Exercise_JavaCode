import Others.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();
        ArrayList l = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode head = root;
        queue.add(head);
        while (!queue.isEmpty()){
            head = queue.remove();
            l.add(head.val);
            if (head.left != null) queue.add(head.left);
            if (head.right != null) queue.add(head.right);
        }
        return l;
    }
}
