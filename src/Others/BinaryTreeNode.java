package Others;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeNode {
    private int value;
    private BinaryTreeNode left = null;
    private BinaryTreeNode right = null;

    public BinaryTreeNode(int value, BinaryTreeNode left, BinaryTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public static void printBinaryTree(BinaryTreeNode node) {
        if(node == null){
            System.out.println("Vaild Tree");
            return;
        }
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        BinaryTreeNode head = node;
        BinaryTreeNode last = head;
        BinaryTreeNode nlast = head.getRight();
        q.add(head);
        while(!q.isEmpty()){
            head = q.remove();
            System.out.print(head.getValue());
            if(head.getLeft() != null){
                nlast = head.getLeft();
                q.add(head.getLeft());
            }
            if(head.getRight() != null){
                nlast = head.getRight();
                q.add(head.getRight());
            }
            if(head.getValue() == last.getValue()){
                System.out.println("");
                last = nlast;
            }
        }
    }
}
