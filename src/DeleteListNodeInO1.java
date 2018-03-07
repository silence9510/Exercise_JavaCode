import Others.ListNode;

public class DeleteListNodeInO1 {

    public static ListNode deleteNode(ListNode head, ListNode tobeDelete){
        if(head == null || tobeDelete == null)
            return null;
//      待删除结点是尾结点
        if(tobeDelete.next == null){
            ListNode cur = head;
            while (cur.next != tobeDelete){
                cur = cur.next;
            }
            cur.next = null;
            return head;
        }
//      待删除结点不是尾结点
        else{
            tobeDelete.val = tobeDelete.next.val;
            tobeDelete.next = tobeDelete.next.next;
            return head;
        }
    }
    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode.printList(deleteNode(l1, l3));
    }
}
