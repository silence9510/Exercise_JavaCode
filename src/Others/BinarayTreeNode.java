package Others;

public class BinarayTreeNode {
    private int value;
    private BinarayTreeNode left = null;
    private BinarayTreeNode right = null;

    public BinarayTreeNode(int value, BinarayTreeNode left, BinarayTreeNode right) {
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

    public BinarayTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinarayTreeNode left) {
        this.left = left;
    }

    public BinarayTreeNode getRight() {
        return right;
    }

    public void setRight(BinarayTreeNode right) {
        this.right = right;
    }
}
