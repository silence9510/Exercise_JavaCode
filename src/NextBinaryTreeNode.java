import Others.BinaryTreeNode_BD;

public class NextBinaryTreeNode {

    public static BinaryTreeNode_BD getNext(BinaryTreeNode_BD bn){

//  有右子树：
        if(bn.right != null){
            BinaryTreeNode_BD cbn = bn.right;
            while (cbn.left != null)
                cbn = cbn.left;
            return cbn;
        }

//  无右子树：
//      为右下节点：
        if(bn.next == null)
            return null;
//      是父节点的左子节点：
        if(bn.next.left == bn)
            return bn.next;
//      是父节点的右子节点：
        BinaryTreeNode_BD cnb = bn;
        while (bn.next != null){
            if(bn == bn.next.left)
                return bn.next;
            bn = bn.next;
        }
        return null;
    }

    public static void main(String[] args) {

        BinaryTreeNode_BD bn9 = new BinaryTreeNode_BD(9, null, null);
        BinaryTreeNode_BD bn8 = new BinaryTreeNode_BD(8, null, null);
        BinaryTreeNode_BD bn7 = new BinaryTreeNode_BD(7, null, null);
        BinaryTreeNode_BD bn6 = new BinaryTreeNode_BD(6, null, null);
        BinaryTreeNode_BD bn5 = new BinaryTreeNode_BD(5, bn8, bn9);
        BinaryTreeNode_BD bn4 = new BinaryTreeNode_BD(4, null, null);
        BinaryTreeNode_BD bn3 = new BinaryTreeNode_BD(3, bn6, bn7);
        BinaryTreeNode_BD bn2 = new BinaryTreeNode_BD(2, bn4, bn5);
        BinaryTreeNode_BD bn1 = new BinaryTreeNode_BD(1, bn2, bn3);

        bn1.setNext(null);
        bn2.setNext(bn1);
        bn3.setNext(bn1);
        bn4.setNext(bn2);
        bn5.setNext(bn2);
        bn6.setNext(bn3);
        bn7.setNext(bn3);
        bn8.setNext(bn5);
        bn9.setNext(bn5);

        System.out.println(getNext(bn3).val);
//        System.out.println(getNext(bn8).val);
//        System.out.println(getNext(bn9).val);
    }
}
