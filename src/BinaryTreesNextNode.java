// Created by ZCL on 2018-04-16.

import Others.TreeLinkNode;

// 如果一个节点的右子树不为空，那么该节点的下一节点是右子树的最左节点；
// 否则，向上找第一个左链接指向的树包含该节点的祖先节点；
public class BinaryTreesNextNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null) node = node.left;
            return node;
        } else {
            while (pNode.next != null) {
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode) return parent;
                pNode = parent;
            }
        }
        return null;
    }
}
