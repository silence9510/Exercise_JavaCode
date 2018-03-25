import Others.BinaryTreeNode;

import java.util.Arrays;

public class RebuildBinaryTree {
    public static BinaryTreeNode Construct(int[] preOrder, int[] midOrder) throws Exception {
        int length = preOrder.length;
        if(preOrder == null || midOrder == null || length < 0){
            return null;
        }
        return ConstructCore(preOrder, 0, preOrder.length-1,
                             midOrder, 0, midOrder.length-1);
    }

    public static BinaryTreeNode ConstructCore(int[] preOrder, int startPreOrder, int endPreOrder,
                                                int[] midOrder, int startMidOrder, int endMidOrder) throws Exception {
//      根据前序遍历寻找根节点的值
        int rootValue = preOrder[startPreOrder];
        BinaryTreeNode root = new BinaryTreeNode(rootValue, null, null);
        if(startPreOrder == endPreOrder){
            if(startMidOrder == endMidOrder && preOrder[startPreOrder] == midOrder[startMidOrder]){
                return root;
            }else {
                throw new Exception("Invaild Input!");
            }
        }
//      根据中序遍历寻找根节点在中序排序中的位置
        int rootMidOrder = startMidOrder;
        while (startMidOrder <= endMidOrder && midOrder[rootMidOrder] != rootValue){
            rootMidOrder++;
        }
        if(rootMidOrder == endMidOrder && midOrder[rootMidOrder] != rootValue){
            throw new Exception("Invaild Input");
        }

        int leftLength = rootMidOrder - startMidOrder;
        int leftPreOrderEnd = startPreOrder + leftLength;
        if(leftLength > 0){
//          左子树
            root.setLeft(ConstructCore(preOrder, startPreOrder+1, leftPreOrderEnd,
                                         midOrder, startMidOrder, rootMidOrder-1));
        }
        if (leftLength < endPreOrder - startPreOrder){
//          右子树
            root.setRight(ConstructCore(preOrder, leftPreOrderEnd+1, endPreOrder,
                                        midOrder, rootMidOrder+1, endMidOrder));
        }
        return root;
    }

    public static void test(int[] preOrder, int[] midOrder, int length) throws Exception {
        System.out.println("先序：" + Arrays.toString(preOrder));
        System.out.println("中序：" + Arrays.toString(midOrder));
        BinaryTreeNode b = Construct(preOrder, midOrder        );
        BinaryTreeNode.printBinaryTree(b);
    }

    public static void main(String[] args) throws Exception {
        int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] midOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        test(preOrder, midOrder, 8);
    }
}