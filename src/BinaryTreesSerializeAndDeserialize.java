import Others.TreeNode;

public class BinaryTreesSerializeAndDeserialize {
    int num = -1;
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
        String[] s = str.split("!");
        root = preOrder(s);
       return root;
    }
    TreeNode preOrder(String[] s){
        num++;
        if (num < s.length){
            if (s[num].equals("#")){
                return null;
            }
            TreeNode root = new TreeNode(Integer.parseInt(s[num]));
            root.left = preOrder(s);
            root.right = preOrder(s);
            return root;
        }else
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
//        System.out.println(new BinaryTreesSerializeAndDeserialize().Deserialize("10!6!4!#!#!8!#!#!14!12!#!#!16!#!#!").val);
    }
}
