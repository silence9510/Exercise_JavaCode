import Others.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintBinaryTree2Lines {

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//      当输入结点为空时，应返回空数组；
        if (pRoot == null) return arr;
        ArrayList<Integer> row = new ArrayList<>();
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode head = pRoot, last = pRoot, nlast = pRoot.right;
        q.add(head);
        while (!q.isEmpty()){
            head = q.poll();
            row.add(head.val);
            if (head.left != null){
                nlast = head.left;
                q.add(nlast);
            }
            if (head.right != null){
                nlast = head.right;
                q.add(nlast);
            }
            if (head == last){
                arr.add(row);
//              row.clear() 不可行，因为保存的还是地址，所以需要新建空间
                row = new ArrayList<>();
                last = nlast;
            }
        }
        return arr;
    }
}
