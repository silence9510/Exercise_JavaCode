package Others;

public class BinaryTreeNode_BD {
    public int val;
    public BinaryTreeNode_BD left;
    public BinaryTreeNode_BD right;
    public BinaryTreeNode_BD next;

    public void setNext(BinaryTreeNode_BD next) {
        this.next = next;
    }

    public BinaryTreeNode_BD(int val, BinaryTreeNode_BD left, BinaryTreeNode_BD right) {
        this.val = val;
        this.left = left;
        this.right = right;


    }
}
