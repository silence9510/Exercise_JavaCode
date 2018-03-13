import Others.ListNode;

import java.util.ArrayList;
import java.util.List;

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

//    水
    public static ListNode EntryNodeOfLoop1(ListNode pHead){

        while (true){
            if (pHead.val >= 999)
                break;
            pHead.val = pHead.val + 999;
            pHead = pHead.next;
        }
        pHead.val = pHead.val - 999;
        return pHead;
    }

    public static ListNode EntryNodeOfLoop2(ListNode pHead){
        while (true){
            if (pHead.next.val < pHead.val)
                break;
            pHead = pHead.next;
        }
        return pHead.next;
    }

    public static ListNode EntryNodeOfLoop3(ListNode pHead){
        List list = new ArrayList();
        while (true){
            System.out.println(pHead);
            if (list.contains(pHead))
                break;
            list.add(pHead);
            pHead = pHead.next;
        }
        return pHead;
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        l5.next = l3;

        System.out.println(EntryNodeOfLoop3(l1).val);
    }
}
