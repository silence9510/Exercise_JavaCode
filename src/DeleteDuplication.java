import Others.ListNode;

public class DeleteDuplication {
    public static ListNode deleteDuplication(ListNode pHead){
        if(pHead == null)   return null;
        if(pHead.next == null)  return pHead;
        if (pHead.val == pHead.next.val) {
            ListNode next = pHead.next;
            while (next != null && pHead.val == next.val)
                next = next.next;
            return deleteDuplication(next);
        }
        pHead.next = deleteDuplication(pHead.next);
        return pHead;
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4_2 = new ListNode(4, l5);
        ListNode l4_1 = new ListNode(4, l4_2);
        ListNode l3_3 = new ListNode(3, l4_1);
        ListNode l3_1 = new ListNode(3, l3_3);
        ListNode l2 = new ListNode(2, l3_1);
        ListNode l1 = new ListNode(1, l2);

        ListNode.printList(deleteDuplication(l1));
    }
}
