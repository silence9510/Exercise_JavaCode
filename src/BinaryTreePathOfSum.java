import Others.TreeNode;

import java.util.ArrayList;

public class BinaryTreePathOfSum {

    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        dfs(root, target, new ArrayList<Integer>());
        return result;
    }

    public void dfs(TreeNode node, int target, ArrayList<Integer> path){
        if (node == null) return;
        path.add(node.val);
        target -= node.val;
        if (target == 0 && node.left == null && node.right == null)
            result.add(new ArrayList<>(path));
        else {
            dfs(node.left, target, path);
            dfs(node.right, target, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {

    }
}
