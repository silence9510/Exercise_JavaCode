import Others.ListNode;

public class MergeTwoSortedLists {
    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null)  return list2;
        if (list2 == null)  return list1;

        ListNode h1 = list1;
        ListNode h2 = list2;
        ListNode mList = new ListNode(-1, null);
        ListNode cur = mList;
        while (h1 != null && h2 != null){
            try {
                if (h1.val <= h2.val){
                    ListNode next1 = h1.next;
                    h1.next = null;
                    mList.next = h1;
                    h1 = next1;
                    mList = mList.next;
                }
                if (h1.val > h2.val){
                    ListNode next2 = h2.next;
                    h2.next = null;
                    mList.next = h2;
                    h2 = next2;
                    mList = mList.next;
                }
            } catch (Exception e) {
                break;
            }
        }
        if (h1 != null)
            mList.next = h1;
        if (h2 != null)
            mList.next = h2;
        return cur.next;
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l3 = new ListNode(3, l5);
        ListNode l1 = new ListNode(1, l3);
        ListNode l6 = new ListNode(6, null);
        ListNode l4 = new ListNode(4, l6);
        ListNode l2 = new ListNode(2, l4);
        ListNode.printList(Merge(l1, l2));
    }
}
