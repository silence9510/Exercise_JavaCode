import Others.ListNode;

public class FindKthToTail {
    public static ListNode findKthToTail(ListNode head, int k){

        int len = 0;
        ListNode cur = head;
        while (cur != null){
            cur = cur.next;
            len += 1;
        }
        if(k > len)
            return null;

        ListNode i1 = head;
        ListNode i2 = head;
        for(int i=0; i<k; i++){
            i2 = i2.next;
        }
        while (i2 != null){
            i1 = i1.next;
            i2 = i2.next;
        }

        return i1;
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        System.out.println(findKthToTail(l1, 6).val);
    }
}
