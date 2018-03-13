import Others.RandomListNode;

public class DiffListDuplication {
    public static RandomListNode duplicate(RandomListNode head){
        if (head == null)   return null;
        RandomListNode tmp = head;
//      结点赋label值
        while (head != null){
            RandomListNode ran = new RandomListNode(head.label);
            RandomListNode next = head.next;
            head.next = ran;
            ran.next = next;
            head = next;
        }
//      结点赋随机指针
        head = tmp;
        while (head != null){
            if (head.random != null)
                head.next.random = head.random.next;
            head = head.next.next;
        }
//      拆分
        head = tmp;
        RandomListNode newHead = head.next;
        while (head.next != null){
            RandomListNode next = head.next;
            head.next = next.next;
            head = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1.random = node5;
        node3.random = node2;
        node5.random = node3;
        RandomListNode rn = duplicate(node1);
        for (int i = 0; i < 5; i++){
            System.out.print(node1+" ");
            System.out.println(rn);
            node1 = node1.next;
            rn = rn.next;
        }
    }
}
