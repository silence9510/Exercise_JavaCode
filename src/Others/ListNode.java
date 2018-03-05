package Others;

public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printList(ListNode ln){
        if(ln == null)
            return;
        if(ln.next == null){
            System.out.print(ln.val + " ");
            return;
        }
        while(ln.next != null){
            System.out.print(ln.val + " ");
            ln = ln.next;
        }
        System.out.print(ln.val + " ");

    }
}
