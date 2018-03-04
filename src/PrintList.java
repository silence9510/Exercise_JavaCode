import Others.ListNode;
import java.util.ArrayList;
import java.util.Stack;

public class PrintList {

    public static ArrayList<Integer> printListFromHeadToTail(ListNode listNode){
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty()){
            ret.add(stack.pop());
        }
        return ret;
    }

    public static void main(String[] args) {
        ListNode ln1 = new ListNode(3,null);
        ListNode ln2 = new ListNode(2, ln1);
        ListNode ln3 = new ListNode(1, ln2);

        System.out.println(printListFromHeadToTail(ln3));
    }
}
