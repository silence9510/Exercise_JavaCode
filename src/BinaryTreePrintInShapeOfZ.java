// Created by ZCL on 2018-04-16.

import Others.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePrintInShapeOfZ {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        boolean reverse = false;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            int count = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (reverse) Collections.reverse(list);
            result.add(list);
            reverse = !reverse;
        }
        return result;
    }
}
