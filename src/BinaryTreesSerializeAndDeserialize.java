import Others.TreeNode;

import java.util.Arrays;
import java.util.List;

public class BinaryTreesSerializeAndDeserialize {
    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if (root == null)
            return "#!";
        sb.append(root.val + "!");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        TreeNode root;
        List<String> s = Arrays.asList(str.split("!"));

       return null;
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

        System.out.println(new BinaryTreesSerializeAndDeserialize().Serialize(n10));
    }
}
