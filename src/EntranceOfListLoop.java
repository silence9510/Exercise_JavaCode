import Others.ListNode;

public class EntranceOfListLoop {
    public static ListNode EntryNodeOfLoop(ListNode pHead)
    {
//        找到环内一点
        if (pHead == null)  return null;
        if (pHead.next == null)  return null;
        ListNode nSlow = pHead;
        ListNode nFast = pHead.next.next;
        while (nSlow != nFast){
            nSlow = nSlow.next;
            nFast = nFast.next.next;
        }
//        计算环长
        int hoopLen = 1;
        nSlow = nSlow.next;
        nFast = nFast.next.next;
        while (nSlow != nFast){
            nSlow = nSlow.next;
            nFast = nFast.next.next;
            hoopLen ++;
        }
//        找入口
        nSlow = pHead; nFast = pHead;
        for (int i=0; i<hoopLen; i++){
            nFast = nFast.next;
        }
        while (nSlow != nFast){
            nSlow = nSlow.next;
            nFast = nFast.next;
        }
        return  nSlow;
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        l5.next = l3;

        System.out.println(EntryNodeOfLoop(l1).val);
    }
}
